package com.example.estique.dymmymvp.view.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.estique.dymmymvp.LoginMvpView;
import com.example.estique.dymmymvp.MainActivity;
import com.example.estique.dymmymvp.MvpApp;
import com.example.estique.dymmymvp.R;
import com.example.estique.dymmymvp.model.DataManager;
import com.example.estique.dymmymvp.presenter.login.LoginPresenter;
import com.example.estique.dymmymvp.utils.CommonUtils;
import com.example.estique.dymmymvp.view.BaseActivity;

/**
 * Created by estique on 9/9/17.
 */

public class LoginActivity extends BaseActivity implements LoginMvpView {

    LoginPresenter loginPresenter;

    EditText editTextEmail, editTextPassword;

    Button button;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        loginPresenter = new LoginPresenter(dataManager);

        loginPresenter.onAttach(this);

        editTextEmail = (EditText) findViewById(R.id.etEmail);
        editTextPassword = (EditText) findViewById(R.id.etPassword);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoginButtonClick();
            }
        });
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void onLoginButtonClick() {

        String emailId = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();


        if (!CommonUtils.isEmailValid(emailId)) {
            Toast.makeText(this, "Enter valid email", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password != null && password.isEmpty()) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
            return;
        }

        loginPresenter.startLogin(emailId);


    }
}
