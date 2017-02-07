package com.trollologic.pocketgithub.search;

import com.trollologic.pocketgithub.login.LoginPresenter;
import com.trollologic.pocketgithub.models.SearchItem;
import com.trollologic.pocketgithub.models.User;


/**
 * Created by miroslav on 16.12.16..
 */

public class SearchClickListeners {

    private final SearchPresenter presenter;

    public SearchClickListeners(SearchPresenter presenter){
        this.presenter = presenter;
    }

    public void onRepoClick(SearchItem item){
        presenter.openRepoDetails(item);
    }
}
