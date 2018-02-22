package com.example.olive.myproductflavorsapp.character_lists;

import com.example.olive.myproductflavorsapp.data.network.model.CharactersModel;
import com.example.olive.myproductflavorsapp.ui.base.MvpView;

/**
 * Created by olive on 21/02/2018.
 */

public interface ICharacterListMvpView extends MvpView {
    void onFetchDataProgress();
    void onFetchDataSuccess(CharactersModel charactersModel);
    void onFetchDataError(String error);
}
