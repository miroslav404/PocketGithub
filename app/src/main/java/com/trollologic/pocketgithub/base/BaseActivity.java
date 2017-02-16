package com.trollologic.pocketgithub.base;

import android.databinding.DataBindingUtil;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.squareup.picasso.Picasso;
import com.trollologic.pocketgithub.PocketGithubApp;
import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.databinding.CustomUserIconActionBarBinding;
import com.trollologic.pocketgithub.models.responses.GithubUser;

/**
 * Created by miroslav on 02.02.17..
 */

public class BaseActivity extends AppCompatActivity {

    private CustomUserIconActionBarBinding binding;

    protected void showSnackBar(View parentLayout, String message){
        Snackbar snackbar = Snackbar
                .make(parentLayout, message, Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    protected void updateUserIcon(BasePresenter presenter, GithubUser user) {
        BaseClickListeners handler = new BaseClickListeners(presenter);
        View actionBarLayout = getLayoutInflater().inflate(R.layout.custom_user_icon_action_bar, null);
        binding = DataBindingUtil.bind(actionBarLayout);

        binding.setUser(user);
        binding.setHandler(handler);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setCustomView(binding.getRoot());
        }

        Picasso.with(this).load(user.getAvatar_url())
                .placeholder(R.drawable.ic_fingerprint_black_24dp)
                .into(binding.actionBarIcon);
    }


    protected void setActionBarLayoutVisibility(boolean visibility){
        if(binding != null){
            binding.actionBarIcon.setVisibility(visibility ? View.VISIBLE : View.GONE);
        }
    }

}
