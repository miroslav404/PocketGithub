package com.trollologic.pocketgithub.utils;

import android.content.Context;
import android.text.TextUtils;

import com.trollologic.pocketgithub.R;

/**
 * Created by miroslav on 08.02.17..
 */

public class ValueHelper {

    public static String isValid(Context context, String resource){
        if(TextUtils.isEmpty(resource)){
            return context.getString(R.string.default_value_for_not_valide_value);
        }
        return resource;
    }
}
