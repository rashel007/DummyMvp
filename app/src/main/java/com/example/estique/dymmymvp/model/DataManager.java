package com.example.estique.dymmymvp.model;

import com.example.estique.dymmymvp.model.SharedPrefsHelper;

/**
 * Created by estique on 9/9/17.
 * It is the only part of model that interacts with presenter and vice varsa,
 * for interaction among other parts of model and presenter,
 * datamanager acts as a middleman
 */

public class DataManager {

    SharedPrefsHelper mShareadPrefsHelper;

    public DataManager(SharedPrefsHelper sharedPrefsHelper) {
        mShareadPrefsHelper = sharedPrefsHelper;
    }

    public void clear() {
        mShareadPrefsHelper.clear();
    }

    public void saveEmailID(String email) {
        mShareadPrefsHelper.putEmail(email);
    }

    public String getEmailId() {
        return mShareadPrefsHelper.getEmail();
    }

    public void setLoggedIn() {
        mShareadPrefsHelper.setLoggedInMode(true);
    }

    public Boolean getLoggedInMode() {
        return mShareadPrefsHelper.getLoggedInMode();
    }
}
