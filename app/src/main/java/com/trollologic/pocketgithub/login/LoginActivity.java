package com.trollologic.pocketgithub.login;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.base.BaseActivity;
import com.trollologic.pocketgithub.databinding.ActivityLoginBinding;
import com.trollologic.pocketgithub.models.User;

import rx.subscriptions.CompositeSubscription;

/**
 * A login screen that offers login via username/password.
 */
public class LoginActivity extends BaseActivity implements LoginView {

    private ActivityLoginBinding binding;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        renderView();

    }

    private void renderView() {
        presenter = new LoginPresenter(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        User user = new User();
        binding.setUser(user);

        binding.setHandler(new LoginClickListeners(presenter));
    }

    @Override
    public void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    public void onProgress() {
        binding.loginProgress.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissProgress() {
        binding.loginProgress.setVisibility(View.GONE);

    }

    @Override
    public void showFailureMessage(String message) {
        dismissProgress();
        showSnackBar(binding.getRoot(), message);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void finishActivity() {
        finish();
    }
}

