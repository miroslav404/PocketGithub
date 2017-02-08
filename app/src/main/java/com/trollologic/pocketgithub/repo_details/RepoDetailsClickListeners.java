package com.trollologic.pocketgithub.repo_details;

import com.trollologic.pocketgithub.models.Owner;


/**
 * Created by miroslav on 16.12.16..
 */

public class RepoDetailsClickListeners {

    private final RepoDetailsPresenter presenter;

    public RepoDetailsClickListeners(RepoDetailsPresenter presenter){
        this.presenter = presenter;
    }

    public void openWebFragment(String url){
        presenter.openWebViewFragment(url);
    }

    public void openUserProfile(Owner user){
        presenter.userProfileClick(user);
    }

}
