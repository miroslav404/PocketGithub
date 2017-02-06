package com.trollologic.pocketgithub.base;

import com.trollologic.pocketgithub.login.LoginPresenter;
import com.trollologic.pocketgithub.models.Owner;
import com.trollologic.pocketgithub.models.User;
import com.trollologic.pocketgithub.models.responses.GithubUser;


/**
 * Created by miroslav on 16.12.16..
 */

public class ActionBarClickListeners {

    private final BasePresenter presenter;

    public ActionBarClickListeners(BasePresenter presenter){
        this.presenter = presenter;
    }


    public void openUserProfile(Owner user){
        presenter.actionBarClick(user);
    }

}
