package com.example.olive.myproductflavorsapp.character_lists;

import com.example.olive.myproductflavorsapp.ui.base.MvpPresenter;

/**
 * Created by olive on 21/02/2018.
 */

public interface ICharacterListMvpPresenter<V extends ICharacterListMvpView> extends MvpPresenter<V> {
    void loadCharacterList();
}
