package com.example.inrating.service;

import com.example.inrating.api.PostApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {

    private static NetworkService mInstance=new NetworkService();
    private Retrofit mRetrofit;
    private final String BASE_URL = "https://api.inrating.top";

    private NetworkService() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static NetworkService getInstance(){
        return mInstance;
    }

    public PostApi getJSONApi() {
        return mRetrofit.create(PostApi.class);
    }
}
