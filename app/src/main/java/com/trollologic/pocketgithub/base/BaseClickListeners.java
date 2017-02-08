package com.trollologic.pocketgithub.base;

import com.trollologic.pocketgithub.models.Owner;


/**
 * Created by miroslav on 16.12.16..
 */

public class BaseClickListeners {

    private final BasePresenter presenter;

    public BaseClickListeners(BasePresenter presenter){
        this.presenter = presenter;
    }


    public void openUserProfile(Owner user){
        presenter.userProfileClick(user);
    }

}
