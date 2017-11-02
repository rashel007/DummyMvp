package com.example.estique.dymmymvp.presenter.splash;

import com.example.estique.dymmymvp.BasePresenter;
import com.example.estique.dymmymvp.SplashMvpView;
import com.example.estique.dymmymvp.model.DataManager;
import com.example.estique.dymmymvp.presenter.splash.SplashMvpPresenter;

/**
 * Created by estique on 9/9/17.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {


    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getmDataManager().getLoggedInMode()) {
            getmMvpView().openMainActivity();
        } else {
            getmMvpView().openLoginActivity();
        }
    }
}
