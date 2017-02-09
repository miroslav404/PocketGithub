package com.trollologic.pocketgithub.service;

import android.support.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.schedulers.Schedulers;


/**
 * Created by miroslav on 02.02.17..
 */

public class NetworkController {

    private static final String CONTENT_TYPE = "Content-Type";
    private static final String APPLICATION_JSON = "application/json";
    private static final String PRAGMA = "Pragma";
    private static final String CACHE_CONTROL = "Cache-Control";
    private static final String AUTHORIZATION = "Authorization";
    private static final String TOKEN = "token ";
    private static final String MAX_AGE_D = "max-age=%d";

    public enum CallType{
        TOKEN, CREDENTIALS, NO_AUTH
    }

    private static GitHubService service;


    public static GitHubService provideCall(CallType type, String token) {
        GitHubService currentService;
        switch (type){
            case CREDENTIALS:
                currentService = getRetrofit(CallType.CREDENTIALS, token).create(GitHubService.class);
                break;
            default:
                if(service == null){
                    service = getRetrofit(type, token).create(GitHubService.class);
                }
                currentService = service;
                break;
        }
        return currentService;
    }

    @NonNull
    private static Retrofit getRetrofit(CallType callType, String token) {

        Interceptor useIntercept = selectInterceptorByType(callType, token);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(useIntercept)
                //TODO remove this line before production
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        return new Retrofit.Builder()
                .baseUrl(com.trollologic.pocketgithub.BuildConfig.BASEURL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io()))
                .build();
    }


    private static Interceptor selectInterceptorByType(CallType type, String token){
        switch (type){
            case TOKEN:
                return getInterceptorWithToken(token);
            case CREDENTIALS:
                return getInterceptorWithCredentials(token);
            default:
                return getInterceptorNoToken();
        }
    }

    @NonNull
    private static Interceptor getInterceptorNoToken() {
        return new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request original = chain.request();

                Request request = original.newBuilder()
                        .header(CONTENT_TYPE, APPLICATION_JSON)
                        .removeHeader(PRAGMA)
                        .header(CACHE_CONTROL, String.format("max-age=%d", com.trollologic.pocketgithub.BuildConfig.CACHETIME))
                        .build();

                return chain.proceed(request);
            }
        };
    }

    @NonNull
    private static Interceptor getInterceptorWithToken(final String token) {
        return new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request original = chain.request();

                Request request = original.newBuilder()
                        .header(CONTENT_TYPE, APPLICATION_JSON)
                        .removeHeader(PRAGMA)
                        .addHeader(AUTHORIZATION, TOKEN + token)
                        .header(CACHE_CONTROL, String.format(MAX_AGE_D, com.trollologic.pocketgithub.BuildConfig.CACHETIME))
                        .build();

                return chain.proceed(request);
            }
        };
    }

    @NonNull
    private static Interceptor getInterceptorWithCredentials(final String basicToken) {
        return new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request original = chain.request();

                Request request = original.newBuilder()
                        .header(CONTENT_TYPE, APPLICATION_JSON)
                        .addHeader(AUTHORIZATION, basicToken)
                        .build();

                return chain.proceed(request);
            }
        };
    }
}