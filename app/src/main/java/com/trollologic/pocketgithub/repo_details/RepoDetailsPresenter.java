package com.trollologic.pocketgithub.repo_details;

import android.content.Intent;

import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.base.BasePresenter;
import com.trollologic.pocketgithub.base.UserProfileFragment;
import com.trollologic.pocketgithub.login.LoginView;
import com.trollologic.pocketgithub.models.Owner;
import com.trollologic.pocketgithub.models.User;
import com.trollologic.pocketgithub.models.responses.Authorization;
import com.trollologic.pocketgithub.search.SearchActivity;
import com.trollologic.pocketgithub.service.NetworkController;
import com.trollologic.pocketgithub.service.NetworkError;
import com.trollologic.pocketgithub.service.Service;
import com.trollologic.pocketgithub.service.ServiceCallbacks;
import com.trollologic.pocketgithub.utils.SharedPrefUtils;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

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
        UserProfileFragment fragment = UserProfileFragment.newInstance(user.getHtml_url());
        view.getFragmentManager().beginTransaction()
                .replace(R.id.content_frame, fragment).addToBackStack(UserProfileFragment.getFragmentTag()).commit();
    }

    @Override
    public void onStart() {

    }

    public void openWebViewFragment(String url){
        RepoWebViewFragment fragment = RepoWebViewFragment.newInstance(url);
        view.getFragmentManager().beginTransaction()
                .replace(R.id.content_frame, fragment).addToBackStack(RepoWebViewFragment.getFragmentTag()).commit();
    }
}
