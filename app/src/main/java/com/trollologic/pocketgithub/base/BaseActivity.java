package com.trollologic.pocketgithub.base;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by miroslav on 02.02.17..
 */

public class BaseActivity extends AppCompatActivity {

    public void showSnackBar(View parentLayout, String message){
        Snackbar snackbar = Snackbar
                .make(parentLayout, message, Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}
