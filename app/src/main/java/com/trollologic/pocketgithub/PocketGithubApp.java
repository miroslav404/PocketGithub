package com.trollologic.pocketgithub;

import android.app.Application;


/**
 * Created by miroslav on 16.02.17..
 */

public class PocketGithubApp extends Application {

//    public static PocketGithubApp instance;
//    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
//        instance = this;
//        refWatcher = LeakCanary.install(this);
    }

//    public void mustDie(Object object) {
//        if (refWatcher != null)
//            refWatcher.watch(object);
//    }
}