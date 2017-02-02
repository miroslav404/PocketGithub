package com.trollologic.pocketgithub.service;

import com.trollologic.pocketgithub.models.requests.AuthorizationRequest;
import com.trollologic.pocketgithub.models.responses.Authorization;
import com.trollologic.pocketgithub.models.responses.Contributor;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by miroslav on 02.02.17..
 */

public interface GitHubService {

    @GET("repos/{owner}/{repo}/contributors")
    Observable<List<Contributor>> repoContributors(
            @Path("owner") String owner,
            @Path("repo") String repo);

    @POST("/authorizations")
    Observable<Authorization> createNewAuthorization(@Body AuthorizationRequest request);
}
