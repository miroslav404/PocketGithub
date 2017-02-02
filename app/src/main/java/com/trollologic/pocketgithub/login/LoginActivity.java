package com.trollologic.pocketgithub.login;

import android.content.Context;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.databinding.ActivityLoginBinding;
import com.trollologic.pocketgithub.models.User;

import rx.subscriptions.CompositeSubscription;

/**
 * A login screen that offers login via username/password.
 */
public class LoginActivity extends AppCompatActivity implements LoginView {

    private CompositeSubscription subscriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        subscriptions = new CompositeSubscription();
        renderView();

    }

    private void renderView() {
        LoginPresenter presenter = new LoginPresenter(this);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        User user = new User();
        binding.setUser(user);

//        final LoginClickListeners clickHandler = new LoginClickListeners(presenter);
        binding.setHandler(new LoginClickListeners(presenter));
    }

    @Override
    public void onStop() {
        super.onStop();
        subscriptions.unsubscribe();
    }

    @Override
    public void loginSuccess() {

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
}

