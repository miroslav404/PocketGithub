package com.trollologic.pocketgithub.service;

import android.util.Log;

import com.trollologic.pocketgithub.models.requests.AuthorizationRequest;
import com.trollologic.pocketgithub.models.responses.Authorization;
import com.trollologic.pocketgithub.models.responses.Contributor;
import com.trollologic.pocketgithub.models.responses.SearchResults;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by miroslav on 02.02.17..
 */

public class Service {

    public static final String TAG = Service.class.getSimpleName();


    public static Subscription getRepoContributors(NetworkController.CallType type, String token, String owner, String repo, final ServiceCallbacks.ContributorsCallback callback) {

        return NetworkController.provideCall(type, token).repoContributors(owner, repo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onErrorResumeNext(new Func1<Throwable, Observable<? extends List<Contributor>>>() {
                    @Override
                    public Observable<? extends List<Contributor>> call(Throwable throwable) {
                        return Observable.error(throwable);
                    }
                })
                .subscribe(new Subscriber<List<Contributor>>() {
                    @Override
                    public void onCompleted() {
                        Log.i(TAG, "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(new NetworkError(e));
                        Log.i(TAG, "onError");

                    }

                    @Override
                    public void onNext(List<Contributor> results) {
                        Log.i(TAG, "onNext");
                        callback.onSuccess(results);
                    }

                });
    }


    public static Subscription getRepositories(NetworkController.CallType type, String query, String sort, String order,
                                               String token, int page, final ServiceCallbacks.SearchCallback callback) {

        return NetworkController.provideCall(type, token).searchRepositories(query, sort, order, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onErrorResumeNext(new Func1<Throwable, Observable<? extends SearchResults>>() {
                    @Override
                    public Observable<? extends SearchResults> call(Throwable throwable) {
                        return Observable.error(throwable);
                    }
                })
                .subscribe(new Subscriber<SearchResults>() {
                    @Override
                    public void onCompleted() {
                        Log.i(TAG, "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(new NetworkError(e));
                        Log.i(TAG, "onError");

                    }

                    @Override
                    public void onNext(SearchResults results) {
                        Log.i(TAG, "onNext");
                        callback.onSuccess(results);
                    }

                });
    }

    public static Subscription createAuthorization(NetworkController.CallType type, String token, final ServiceCallbacks.AuthorizationCallback callback) {

        return NetworkController.provideCall(type, token).createNewAuthorization(new AuthorizationRequest("PocketGithub_authorization"))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onErrorResumeNext(new Func1<Throwable, Observable<? extends Authorization>>() {
                    @Override
                    public Observable<? extends Authorization> call(Throwable throwable) {
                        return Observable.error(throwable);
                    }
                })
                .subscribe(new Subscriber<Authorization>() {
                    @Override
                    public void onCompleted() {
                        Log.i(TAG, "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(new NetworkError(e));
                        Log.i(TAG, "onError");

                    }

                    @Override
                    public void onNext(Authorization results) {
                        Log.i(TAG, "onNext");
                        callback.onSuccess(results);
                    }

                });
    }
}
