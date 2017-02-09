package com.trollologic.pocketgithub.base;

import com.trollologic.pocketgithub.models.Owner;

/**
 * Created by miroslav on 05.01.17..
 */

public interface BasePresenter {

    void onStart();

    void onStop();

    void userProfileClick(Owner user);

}
