package com.trollologic.pocketgithub.service;

import com.google.gson.annotations.SerializedName;

/**
 * Created by miroslav on 09.02.17..
 */

public class ErrorResponse {

//    {"message":"Bad credentials"}
    String message;

    public ErrorResponse(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
