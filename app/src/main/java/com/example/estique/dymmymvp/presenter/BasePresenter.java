package com.example.estique.dymmymvp.presenter;

import com.example.estique.dymmymvp.MvpPresenter;
import com.example.estique.dymmymvp.MvpView;
import com.example.estique.dymmymvp.model.DataManager;

/**
 * Created by estique on 9/9/17.
 * It is the base class fort all presenter that implements MvpPresenter
 * and it is extended by all other presenters there in application
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    DataManager mDataManager;


    public BasePresenter(DataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getmMvpView() {
        return mMvpView;
    }

    public DataManager getmDataManager() {
        return mDataManager;
    }
}
