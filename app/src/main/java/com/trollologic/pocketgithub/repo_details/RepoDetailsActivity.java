package com.trollologic.pocketgithub.repo_details;

import android.app.FragmentManager;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.net.Uri;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.squareup.picasso.Picasso;
import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.base.BaseActivity;
import com.trollologic.pocketgithub.base.OnFragmentInteractionListener;
import com.trollologic.pocketgithub.databinding.ActivityRepoDetailsBinding;
import com.trollologic.pocketgithub.models.SearchItem;
import com.trollologic.pocketgithub.utils.Constants;
import com.trollologic.pocketgithub.utils.ValueHelper;

public class RepoDetailsActivity extends BaseActivity implements RepoDetailsView, OnFragmentInteractionListener {

    private SearchItem repository;
    private ActivityRepoDetailsBinding  binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        repository = (SearchItem)getIntent().getParcelableExtra(Constants.REPO_DETAILS);
        renderView();
    }

    private void renderView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_repo_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.setRepository(repository);
        binding.setHandler(new RepoDetailsClickListeners(new RepoDetailsPresenter(this)));
        Picasso.with(this).load(repository.getOwner().getAvatar_url())
                .placeholder(R.drawable.ic_fingerprint_black_24dp)
                .into(binding.repoAvatar);

        binding.language.setText(getString(R.string.two_strings_with_colon,
                getString(R.string.language), ValueHelper.isValid(this, repository.getLanguage())));
        binding.issues.setText(getString(R.string.two_strings_with_colon,
                getString(R.string.open_issues_count), String.valueOf(repository.getOpen_issues())));
        binding.defaultBranch.setText(getString(R.string.two_strings_with_colon,
                getString(R.string.default_branch), ValueHelper.isValid(this, repository.getDefault_branch())));
        binding.description.setText(getString(R.string.two_strings_with_colon,
                getString(R.string.description), ValueHelper.isValid(this, repository.getDescription())));

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
    public void onProgress() {

    }

    @Override
    public void dismissProgress() {

    }

    @Override
    public void showFailureMessage(String message) {

    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public FragmentManager getFragmentManager() {
        return super.getFragmentManager();
    }

    @Override
    public ActivityRepoDetailsBinding getBinding() {
        return binding;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
