package com.trollologic.pocketgithub.base;

import android.content.Context;

/**
 * Created by miroslav on 12.12.16..
 */

public interface BaseView {

    void onProgress();

    void dismissProgress();

    void showFailureMessage(String message);

    Context getContext();

}
