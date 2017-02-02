package com.trollologic.pocketgithub.models.requests;

/**
 * Created by miroslav on 02.02.17..
 */

public class AuthorizationRequest {
    /*
    PARAM:scopes	array	A list of scopes that this authorization is in.
    PARAM:note	string	Required. A note to remind you what the OAuth token is for. Tokens not associated with a specific OAuth application (i.e. personal access tokens) must have a unique note.
    PARAM:note_url	string	A URL to remind you what app the OAuth token is for.
    PARAM:client_id	string	The 20 character OAuth app client key for which to create the token.
    PARAM:client_secret	string	The 40 character OAuth app client secret for which to create the token.
    PARAM:fingerprint	string	A unique string to distinguish an authorization from others created for the same client ID and user.
     */

    String note;

    public AuthorizationRequest(String note){
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
