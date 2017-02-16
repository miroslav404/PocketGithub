package com.trollologic.pocketgithub.search;

import android.app.FragmentManager;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;

import com.trollologic.pocketgithub.PocketGithubApp;
import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.base.BaseActivity;
import com.trollologic.pocketgithub.base.OnFragmentInteractionListener;
import com.trollologic.pocketgithub.databinding.ActivitySearchBinding;
import com.trollologic.pocketgithub.models.SearchItem;
import com.trollologic.pocketgithub.models.responses.GithubUser;
import com.trollologic.pocketgithub.models.responses.SearchResults;
import com.trollologic.pocketgithub.utils.Constants;
import com.trollologic.pocketgithub.utils.EndlessRecyclerViewScrollListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchActivity extends BaseActivity implements SearchView.OnQueryTextListener, com.trollologic.pocketgithub.search.SearchView, OnFragmentInteractionListener {

    private static final String TAG = SearchActivity.class.getSimpleName();
    private static final int START_PAGE = 1;
    private ActivitySearchBinding binding;
    private SearchPresenter presenter;
    private String sort = Constants.SORT_BY_STARTS;
    private String order = Constants.ORDER_ASC;
    private List<SearchItem> searchResult;
    private ResultAdapter mAdapter;
    private String lastQuery;
    private EndlessRecyclerViewScrollListener paginator;
    private MenuItem searchItem;
    private boolean newSearchInProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        renderView();
    }

    private void renderView() {
        presenter = new SearchPresenter(this);
        presenter.getUserInfo();
        prepareAdapter();
        prepareFilterListener();
    }

//    @Override
//    public void onDestroy(){
//        super.onDestroy();
//        PocketGithubApp.instance.mustDie(this);
//    }

    private void prepareFilterListener() {
        binding.stars.setChecked(true);
        binding.filterGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.updated:
                        sort = Constants.SORT_BY_UPDATED;
                        makeNewSearch();
                        break;
                    case R.id.forks:
                        sort = Constants.SORT_BY_FORKS;
                        makeNewSearch();
                        break;
                    default:
                        sort = Constants.SORT_BY_STARTS;
                        makeNewSearch();
                        break;

                }
            }
        });
    }

    private void prepareAdapter() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search);
        binding.resultRecyclerView.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        binding.resultRecyclerView.setLayoutManager(mLayoutManager);
        searchResult = new ArrayList<>();
        mAdapter = new ResultAdapter(this, searchResult, presenter);
        binding.resultRecyclerView.setAdapter(mAdapter);
        createPaginationListener(mLayoutManager);
        binding.resultRecyclerView.addOnScrollListener(paginator);
    }

    private void createPaginationListener(final LinearLayoutManager mLayoutManager) {
        paginator = new EndlessRecyclerViewScrollListener(mLayoutManager) {

            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                presenter.search(lastQuery, sort, order, page+ START_PAGE);
            }
        };
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);
        searchItem = menu.findItem(R.id.search);
        SearchView searchView =
                (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        lastQuery = query;
        makeNewSearch();
        return false;
    }

    private void makeNewSearch() {
        if(!TextUtils.isEmpty(lastQuery)) {
            newSearchInProgress= true;
//            searchResult.clear();
            paginator.resetState();
            presenter.search(lastQuery, sort, order, START_PAGE);
        }
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

    @Override
    public void onProgress() {
        if(searchResult.isEmpty()) {
            binding.progressLayout.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void dismissProgress() {
        binding.progressLayout.setVisibility(View.GONE);
    }

    @Override
    public void showFailureMessage(String message) {
        showSnackBar(binding.getRoot(), message);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void updateResultList(SearchResults items) {
        if(newSearchInProgress){
            searchResult.clear();
            newSearchInProgress = false;
        }
        searchResult.addAll(Arrays.asList(items.getItems()));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public ResultAdapter getAdapter() {
        return mAdapter;
    }

    @Override
    public void updateUserInfo(GithubUser user) {
        updateUserIcon(presenter, user);
    }

    @Override
    public FragmentManager getFragmentManager() {
        return super.getFragmentManager();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }

    @Override
    public void onHiddenChanged(String tag, boolean visible) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(visible);
        searchItem.setVisible(!visible);
        setActionBarLayoutVisibility(!visible);
    }
}
