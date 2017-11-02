package com.example.estique.dymmymvp.presenter.main;

import com.example.estique.dymmymvp.MainMvpView;
import com.example.estique.dymmymvp.MvpPresenter;

/**
 * Created by estique on 9/9/17.
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();

    void setUserLoggedOut();
}
