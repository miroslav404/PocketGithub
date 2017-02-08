package com.trollologic.pocketgithub.repo_details;


import android.app.FragmentManager;

import com.trollologic.pocketgithub.base.BaseView;
import com.trollologic.pocketgithub.databinding.ActivityRepoDetailsBinding;

/**
 * Created by miroslav on 02.02.17..
 */

public interface RepoDetailsView extends BaseView {

    FragmentManager getFragmentManager();
    ActivityRepoDetailsBinding getBinding();
}
