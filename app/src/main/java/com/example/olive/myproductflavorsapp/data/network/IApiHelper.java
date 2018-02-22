package com.example.olive.myproductflavorsapp.data.network;

import com.example.olive.myproductflavorsapp.data.network.model.CharactersModel;

import io.reactivex.Observable;

/**
 * Created by olive on 21/02/2018.
 */

public interface IApiHelper {

    Observable<CharactersModel> getSimpsonsList(String Api);
}
