package com.example.olive.myproductflavorsapp.data.network;

import com.example.olive.myproductflavorsapp.data.network.model.CharactersModel;

import io.reactivex.Observable;

/**
 * Created by olive on 21/02/2018.
 */

public class AppDataManager implements IDataManager{
    IApiHelper iApiHelper;

    public AppDataManager() { iApiHelper = new AppApiHelper(); }

    @Override
    public Observable<CharactersModel> getSimpsonsList(String Api) {
        return iApiHelper.getSimpsonsList(Api);
    }
}
