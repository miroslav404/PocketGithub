package com.trollologic.pocketgithub.models.responses;

/**
 * Created by miroslav on 02.02.17..
 */

public class Contributor {

    private String login;
    private int contributions;

    @Override
    public String toString() {
        return login + " (" + contributions + ")";
    }
}
