package com.example.estique.dymmymvp.presenter.splash;

import com.example.estique.dymmymvp.MvpPresenter;
import com.example.estique.dymmymvp.SplashMvpView;

/**
 * Created by estique on 9/9/17.
 */

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();
}
