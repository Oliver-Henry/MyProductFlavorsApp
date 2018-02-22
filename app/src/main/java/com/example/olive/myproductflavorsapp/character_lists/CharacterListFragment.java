package com.example.olive.myproductflavorsapp.character_lists;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.olive.myproductflavorsapp.R;
import com.example.olive.myproductflavorsapp.data.network.AppDataManager;
import com.example.olive.myproductflavorsapp.data.network.model.CharactersModel;
import com.example.olive.myproductflavorsapp.ui.base.BaseFragment;
import com.example.olive.myproductflavorsapp.ui.utils.rx.AppSchedulerProvider;
import com.github.pwittchen.reactivenetwork.library.rx2.ReactiveNetwork;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * A simple {@link Fragment} subclass.
 */
public class CharacterListFragment extends BaseFragment implements ICharacterListMvpView {

    private RecyclerView recyclerView;
    private CharacterListPresenterImpl<CharacterListFragment> characterListFragmentCharacterListPresenter;

    public CharacterListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rVCharacters);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        callService();
        characterListFragmentCharacterListPresenter = new CharacterListPresenterImpl<>(new AppDataManager(), new AppSchedulerProvider(), new CompositeDisposable());
        characterListFragmentCharacterListPresenter.onAttach(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character_list, container, false);
    }

    public void callService(){
        ReactiveNetwork.observeInternetConnectivity()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean isConnectedToInternet) {
                        if(isConnectedToInternet){
                            characterListFragmentCharacterListPresenter.loadCharacterList();
                        }
                        else{
                            Toast.makeText(getActivity(), "No Internet Connection", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    @Override
    public void onFetchDataProgress() {
        showLoading();
    }

    @Override
    public void onFetchDataSuccess(CharactersModel charactersModel) {
       // Toast.makeText(getActivity(), charactersModel.getRelatedTopics().get(0).getText(), Toast.LENGTH_SHORT).show();
         recyclerView.setAdapter(new CharacterListAdapter(getActivity().getApplicationContext(), charactersModel.getRelatedTopics(), R.layout.row));
                hideLoading();
    }

    @Override
    public void onFetchDataError(String error) {
    showMessage(error);
    hideLoading();
    }
}
