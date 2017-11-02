package com.example.estique.dymmymvp.view.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.estique.dymmymvp.MvpApp;
import com.example.estique.dymmymvp.R;
import com.example.estique.dymmymvp.SplashMvpView;
import com.example.estique.dymmymvp.model.DataManager;
import com.example.estique.dymmymvp.presenter.splash.SplashPresenter;
import com.example.estique.dymmymvp.view.BaseActivity;
import com.example.estique.dymmymvp.view.main.MainActivity;

/**
 * Created by estique on 9/9/17.
 */

public class SplashActivity extends BaseActivity implements SplashMvpView {

    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();

        mSplashPresenter = new SplashPresenter(dataManager);

        mSplashPresenter.onAttach(this);

        mSplashPresenter.decideNextActivity();

    }

    @Override
    public void openMainActivity() {
        Intent intent =  MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = SplashActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
