package com.trollologic.pocketgithub.repo_details;

import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.base.BasePresenter;
import com.trollologic.pocketgithub.base.WebViewFragment;
import com.trollologic.pocketgithub.models.Owner;

/**
 * Created by miroslav on 12.12.16..
 */

public class RepoDetailsPresenter implements BasePresenter {
    private static final String TAG = RepoDetailsPresenter.class.getSimpleName();
    private final RepoDetailsView view;

    public RepoDetailsPresenter(RepoDetailsView view) {
        this.view = view;
    }

    public void onStop(){
    }

    @Override
    public void userProfileClick(Owner user) {
        openWebViewFragment(user.getHtml_url());
    }

    @Override
    public void onStart() {

    }

    public void openWebViewFragment(String url){
        WebViewFragment fragment = WebViewFragment.newInstance(url);
        view.getFragmentManager().beginTransaction()
                .replace(R.id.content_frame, fragment).addToBackStack(WebViewFragment.getFragmentTag()).commit();
    }
}
