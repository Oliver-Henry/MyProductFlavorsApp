package com.example.olive.myproductflavorsapp.data.network;

import com.example.olive.myproductflavorsapp.data.network.model.CharactersModel;
import com.example.olive.myproductflavorsapp.data.network.service.IRequestInterface;
import com.example.olive.myproductflavorsapp.data.network.service.ServiceConnection;

import io.reactivex.Observable;

/**
 * Created by olive on 21/02/2018.
 */

public class AppApiHelper implements IApiHelper {
    IRequestInterface iRequestInterface;

    public AppApiHelper() { iRequestInterface = ServiceConnection.getConnection();
    }


    @Override
    public Observable<CharactersModel> getSimpsonsList(String Api) {
        return iRequestInterface.getSimpsonsCharList();
    }
}
