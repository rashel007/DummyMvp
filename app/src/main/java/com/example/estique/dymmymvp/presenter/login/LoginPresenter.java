package com.example.estique.dymmymvp.presenter.login;

import com.example.estique.dymmymvp.BasePresenter;
import com.example.estique.dymmymvp.LoginMvpView;
import com.example.estique.dymmymvp.model.DataManager;
import com.example.estique.dymmymvp.presenter.login.LoginMvpPresenter;

/**
 * Created by estique on 9/9/17.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getmDataManager().saveEmailID(emailId);
        getmDataManager().setLoggedIn();
        getmMvpView().openMainActivity();
    }
}
