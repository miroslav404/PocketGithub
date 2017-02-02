package com.trollologic.pocketgithub.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by miroslav on 02.02.17..
 */

public class SharedPrefUtils {

    public static final String AUTH_TOKEN = "AUTH_TOKEN";
    private static SharedPreferences sPrefs;

    private static SharedPreferences getPrefs(Context context){
        if(sPrefs == null){
            sPrefs = PreferenceManager.getDefaultSharedPreferences(context);
        }
        return sPrefs;
    }

    public static void setToken(Context context, String token){
        SharedPreferences.Editor editor = getPrefs(context).edit();
        editor.putString(AUTH_TOKEN, token);
        editor.apply();
    }

    public static String getToken(Context context){
        SharedPreferences prefs = getPrefs(context);
        return prefs.getString(AUTH_TOKEN, null);
    }
}
