package com.trollologic.pocketgithub.login;

import android.content.Intent;

import com.trollologic.pocketgithub.base.BasePresenter;
import com.trollologic.pocketgithub.models.Owner;
import com.trollologic.pocketgithub.models.User;
import com.trollologic.pocketgithub.models.responses.Authorization;
import com.trollologic.pocketgithub.search.SearchActivity;
import com.trollologic.pocketgithub.service.NetworkError;
import com.trollologic.pocketgithub.service.Service;
import com.trollologic.pocketgithub.service.ServiceCallbacks;
import com.trollologic.pocketgithub.utils.SharedPrefUtils;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by miroslav on 12.12.16..
 */

public class LoginPresenter implements BasePresenter {
    private static final String TAG = LoginPresenter.class.getSimpleName();
    private final LoginView view;
    private final CompositeSubscription subscriptions;

    public LoginPresenter(LoginView view) {
        this.view = view;
        this.subscriptions = new CompositeSubscription();
    }

    public void login(User user) {
        view.onProgress();

        Subscription sub = Service.createAuthorization(user.encodeCredentialsForBasicAuthorization(),
                new ServiceCallbacks.AuthorizationCallback() {

            @Override
            public void onSuccess(Authorization response) {
                view.dismissProgress();
                SharedPrefUtils.setToken(view.getContext(), response.getToken());
                goToSearchScreen();
            }

            @Override
            public void onError(NetworkError networkError) {
                view.showFailureMessage(networkError.getMessage());
            }
        });
        subscriptions.add(sub);
    }



    public void onStop() {
        subscriptions.unsubscribe();
    }

    @Override
    public void userProfileClick(Owner user) {

    }


    @Override
    public void onStart() {

    }

    public void skipLogin() {
        SharedPrefUtils.setToken(view.getContext(), null);
        goToSearchScreen();
    }

    private void goToSearchScreen() {
        view.getContext().startActivity(new Intent(view.getContext(), SearchActivity.class));
        view.finishActivity();
    }
}
