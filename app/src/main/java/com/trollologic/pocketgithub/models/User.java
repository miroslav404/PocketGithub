package com.trollologic.pocketgithub.models;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Base64;

/**
 * Created by miroslav on 02.02.17..
 */

public class User {

    private static final String BASIC_TOKEN_PREFIX = "Basic ";

    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TextWatcher usernameWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (!TextUtils.equals(username, s.toString())) {
                username = s.toString();
            }
        }
    };

    public TextWatcher passwordWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (!TextUtils.equals(password, s.toString())) {
                password = s.toString();
            }
        }
    };

    public String encodeCredentialsForBasicAuthorization() {
        final String userAndPassword = username + ":" + password;
        return BASIC_TOKEN_PREFIX + Base64.encodeToString(userAndPassword.getBytes(), Base64.NO_WRAP);
    }

}
