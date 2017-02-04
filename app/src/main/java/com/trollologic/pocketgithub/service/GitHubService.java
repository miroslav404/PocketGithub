package com.trollologic.pocketgithub.service;

import com.trollologic.pocketgithub.models.requests.AuthorizationRequest;
import com.trollologic.pocketgithub.models.responses.Authorization;
import com.trollologic.pocketgithub.models.responses.Contributor;
import com.trollologic.pocketgithub.models.responses.SearchResults;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
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

    //https://api.github.com/search/repositories?q=screen&sort=stars&order=desc
    @GET("search/repositories")
    Observable<SearchResults> searchRepositories(@Query("q") String query, @Query("sort") String sort, @Query("order") String order, @Query("page") int page);
}
