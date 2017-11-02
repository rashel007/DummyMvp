package com.example.estique.dymmymvp.model;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by estique on 9/9/17.
 * It is called only by data manager. Presenter never directly interacts
 * with ShareadPrefsHelper
 */

public class SharedPrefsHelper {

    public static final String MY_PREFS = "MY_PREFS";

    public static final String EMAIL = "EMAIL";

    SharedPreferences mSharedPreferences;

    public SharedPrefsHelper(Context context) {
        mSharedPreferences = context.getSharedPreferences(MY_PREFS, Context.MODE_PRIVATE);
    }

    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }

    public void putEmail(String email) {
        mSharedPreferences.edit().putString(EMAIL, email).apply();
    }

    public String getEmail() {
        return mSharedPreferences.getString(EMAIL, null);
    }

    public boolean getLoggedInMode() {
        return mSharedPreferences.getBoolean("IS_LOGGED_IN", false);
    }

    public void setLoggedInMode(boolean loggedIn) {
        mSharedPreferences.edit().putBoolean("IS_LOGGED_IN", loggedIn);
    }

}
