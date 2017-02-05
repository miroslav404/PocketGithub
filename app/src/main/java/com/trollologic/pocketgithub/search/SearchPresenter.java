package com.trollologic.pocketgithub.search;

import android.content.Intent;
import android.util.Log;

import com.trollologic.pocketgithub.base.BasePresenter;
import com.trollologic.pocketgithub.login.LoginView;
import com.trollologic.pocketgithub.models.User;
import com.trollologic.pocketgithub.models.responses.Authorization;
import com.trollologic.pocketgithub.models.responses.GithubUser;
import com.trollologic.pocketgithub.models.responses.SearchResults;
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

public class SearchPresenter implements BasePresenter {
    private static final String TAG = SearchPresenter.class.getSimpleName();
    private final SearchView view;
    private CompositeSubscription subscriptions;

    public SearchPresenter(SearchView view) {
        this.view = view;
        this.subscriptions = new CompositeSubscription();
    }

    public void search(String query, String sort, String order, int page) {
        view.onProgress();
        String token = SharedPrefUtils.getToken(view.getContext());
        NetworkController.CallType callType = token == null ?
                NetworkController.CallType.NO_AUTH : NetworkController.CallType.TOKEN;
        Subscription sub = Service.getRepositories(callType, query, sort, order, token, page,
                new ServiceCallbacks.SearchCallback() {
            @Override
            public void onSuccess(SearchResults response) {
                    view.updateResultList(response);
                if(view.getAdapter() != null) {
                    view.getAdapter().notifyDataSetChanged();
                }
            }

            @Override
            public void onError(NetworkError networkError) {
                view.showFailureMessage(networkError.getMessage());
            }
        });
        subscriptions.add(sub);
    }

    public void getUserInfo(){
        String token = SharedPrefUtils.getToken(view.getContext());
        if(token != null) {
            NetworkController.CallType callType = token == null ?
                    NetworkController.CallType.NO_AUTH : NetworkController.CallType.TOKEN;
            Subscription sub = Service.getUserInfo(callType, token,
                    new ServiceCallbacks.UserCallback() {
                        @Override
                        public void onSuccess(GithubUser response) {
                            view.updateUserInfo(response);
                        }

                        @Override
                        public void onError(NetworkError networkError) {
                            view.showFailureMessage(networkError.getMessage());
                        }
                    });
            subscriptions.add(sub);
        }
    }

    public void onStop() {
        subscriptions.unsubscribe();
    }

    @Override
    public void actionBarClick(GithubUser user) {
        Log.i(TAG, "open user profile");
    }


    @Override
    public void onStart() {

    }

}
