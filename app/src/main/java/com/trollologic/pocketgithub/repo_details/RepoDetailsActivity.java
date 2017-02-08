package com.trollologic.pocketgithub.repo_details;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.squareup.picasso.Picasso;
import com.trollologic.pocketgithub.R;
import com.trollologic.pocketgithub.base.BaseActivity;
import com.trollologic.pocketgithub.databinding.ActivityRepoDetailsBinding;
import com.trollologic.pocketgithub.models.SearchItem;
import com.trollologic.pocketgithub.utils.Constants;
import com.trollologic.pocketgithub.utils.ValueHelper;

public class RepoDetailsActivity extends BaseActivity implements RepoDetailsView {

    private SearchItem repository;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_repo_details);

        repository = (SearchItem)getIntent().getParcelableExtra(Constants.REPO_DETAILS);
        renderView();
    }

    private void renderView() {
        ActivityRepoDetailsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_repo_details);
        binding.setRepository(repository);

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
