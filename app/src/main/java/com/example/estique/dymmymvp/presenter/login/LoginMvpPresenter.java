package com.example.estique.dymmymvp.presenter.login;

import com.example.estique.dymmymvp.LoginMvpView;
import com.example.estique.dymmymvp.MvpPresenter;

/**
 * Created by estique on 9/9/17.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);
}
