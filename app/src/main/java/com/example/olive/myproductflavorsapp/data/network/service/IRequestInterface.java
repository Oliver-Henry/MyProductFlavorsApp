package com.example.olive.myproductflavorsapp.data.network.service;

import com.example.olive.myproductflavorsapp.BuildConfig;
import com.example.olive.myproductflavorsapp.data.network.model.CharactersModel;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by olive on 21/02/2018.
 */

public interface IRequestInterface {
    @GET(BuildConfig.INFO)
    Observable<CharactersModel> getSimpsonsCharList();
}
