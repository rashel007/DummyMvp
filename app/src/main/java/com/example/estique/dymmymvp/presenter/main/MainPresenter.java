package com.example.estique.dymmymvp.presenter.main;

import com.example.estique.dymmymvp.BasePresenter;
import com.example.estique.dymmymvp.MainMvpView;
import com.example.estique.dymmymvp.model.DataManager;
import com.example.estique.dymmymvp.presenter.main.MainMvpPresenter;

/**
 * Created by estique on 9/9/17.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {


    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getmDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getmDataManager().clear();
        getmMvpView().openSplashActivity();
    }
}
