package com.trollologic.pocketgithub.service;

import com.trollologic.pocketgithub.models.responses.Authorization;
import com.trollologic.pocketgithub.models.responses.Contributor;
import com.trollologic.pocketgithub.models.responses.SearchResults;

import java.util.List;

/**
 * Created by miroslav on 02.02.17..
 */

public class ServiceCallbacks {

    public interface ContributorsCallback{
        void onSuccess(List<Contributor> response);

        void onError(NetworkError networkError);
    }

    public interface AuthorizationCallback{
        void onSuccess(Authorization response);

        void onError(NetworkError networkError);
    }

    public interface SearchCallback {
        void onSuccess(SearchResults response);

        void onError(NetworkError networkError);
    }
}
