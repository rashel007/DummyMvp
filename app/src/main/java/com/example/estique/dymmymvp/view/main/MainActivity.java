package com.example.estique.dymmymvp.view.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.estique.dymmymvp.MainMvpView;
import com.example.estique.dymmymvp.MvpApp;
import com.example.estique.dymmymvp.R;
import com.example.estique.dymmymvp.SplashActivity;
import com.example.estique.dymmymvp.model.DataManager;
import com.example.estique.dymmymvp.presenter.main.MainPresenter;
import com.example.estique.dymmymvp.view.BaseActivity;

public class MainActivity extends BaseActivity implements MainMvpView {

    TextView textViewShow;
    Button buttonLogout;
    MainPresenter mainPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        mainPresenter = new MainPresenter(dataManager);
        mainPresenter.onAttach(this);

        textViewShow = (TextView) findViewById(R.id.tv);

        buttonLogout = (Button) findViewById(R.id.btn);

        textViewShow.setText(mainPresenter.getEmailId());

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.setUserLoggedOut();
            }
        });

    }

    @Override
    public void openSplashActivity() {
        Intent intent = SplashActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
