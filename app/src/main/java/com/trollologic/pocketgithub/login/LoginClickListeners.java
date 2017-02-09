package com.trollologic.pocketgithub.login;

import com.trollologic.pocketgithub.models.User;


/**
 * Created by miroslav on 16.12.16..
 */

public class LoginClickListeners {

    private final LoginPresenter presenter;

    public LoginClickListeners(LoginPresenter presenter){
        this.presenter = presenter;
    }

    public void login(User user){
        presenter.login(user);
    }

    public void skipAuthorization(){
        presenter.skipLogin();
    }

}
