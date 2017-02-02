package com.trollologic.pocketgithub.models.responses;

/**
 * Created by miroslav on 02.02.17..
 */

public class Authorization {

    /*
    {
  "id": 801287002,
  "url": "https://api.github.com/authorizations/801287002",
  "app": {
    "name": "test_token_02_02_2016_13-07",
    "url": "https://developer.github.com/v3/oauth_authorizations/",
    "client_id": "123"
  },
  "token": "72345d1b511239e0c5d02f536f409f1fefchdb2e",
  "hashed_token": "96e19ftca39c439029247dff8a742d0c9daf69f11115ba89a9c67942f310f52ab",
  "token_last_eight": "efchdb2e",
  "note": "test_token_02_02_2016_13-07",
  "note_url": null,
  "created_at": "2017-02-02T12:07:10Z",
  "updated_at": "2017-02-02T12:07:10Z",
  "scopes": [],
  "fingerprint": null
}
     */

    long id;
    String url;
    String token;
    String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
