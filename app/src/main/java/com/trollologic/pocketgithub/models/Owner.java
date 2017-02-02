package com.trollologic.pocketgithub.models;

/**
 * Created by miroslav on 02.02.17..
 */

public class Owner{
    long id;
    String avatar_url;
    String login;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
