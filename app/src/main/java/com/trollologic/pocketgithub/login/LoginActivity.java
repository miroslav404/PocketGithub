package com.trollologic.pocketgithub.login;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.trollologic.pocketgithub.PocketGithubApp;
import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.base.BaseActivity;
import com.trollologic.pocketgithub.databinding.ActivityLoginBinding;
import com.trollologic.pocketgithub.models.User;
import com.trollologic.pocketgithub.search.SearchActivity;
import com.trollologic.pocketgithub.utils.SharedPrefUtils;

/**
 * A login screen that offers login via username/password.
 */
public class LoginActivity extends BaseActivity implements LoginView {

    private ActivityLoginBinding binding;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(SharedPrefUtils.getToken(this) == null) {
            renderView();
        }else{
            startActivity(new Intent(this, SearchActivity.class));
            finish();
        }

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
        binding.progressLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissProgress() {
        binding.progressLayout.setVisibility(View.GONE);

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

//    @Override
//    public void onDestroy(){
//        super.onDestroy();
//        PocketGithubApp.instance.mustDie(this);
//    }
}

