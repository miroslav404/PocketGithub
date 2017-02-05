package com.trollologic.pocketgithub.base;

import com.trollologic.pocketgithub.models.responses.GithubUser;

/**
 * Created by miroslav on 05.01.17..
 */

public interface BasePresenter {

    void onStart();

    void onStop();

    void actionBarClick(GithubUser user);

}
