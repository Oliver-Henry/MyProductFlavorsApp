package com.example.olive.myproductflavorsapp.character_lists;

import com.example.olive.myproductflavorsapp.BuildConfig;
import com.example.olive.myproductflavorsapp.data.network.IDataManager;
import com.example.olive.myproductflavorsapp.data.network.model.CharactersModel;
import com.example.olive.myproductflavorsapp.ui.base.BasePresenter;
import com.example.olive.myproductflavorsapp.ui.utils.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by olive on 21/02/2018.
 */

public class CharacterListPresenterImpl <V extends ICharacterListMvpView> extends BasePresenter<V> implements ICharacterListMvpPresenter<V> {

    public CharacterListPresenterImpl(IDataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }


    @Override
    public void loadCharacterList() {

        getCompositeDisposable().add(getDataManager().getSimpsonsList(BuildConfig.INFO)
        .subscribeOn(getSchedulerProvider().io())
        .observeOn(getSchedulerProvider().ui())
        .subscribe(new Consumer<CharactersModel>() {
                       @Override
                       public void accept(CharactersModel charactersModel) throws Exception {
                            getMvpView().onFetchDataSuccess(charactersModel);
                       }
                   },
                new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        getMvpView().onFetchDataError(throwable.getMessage());
                    }
                }));

    }
}
