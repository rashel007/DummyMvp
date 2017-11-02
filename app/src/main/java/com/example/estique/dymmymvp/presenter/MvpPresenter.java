package com.example.estique.dymmymvp.presenter;

import com.example.estique.dymmymvp.view.MvpView;

/**
 * Created by estique on 9/9/17.
 * It is an interface that is implemented by BasePresenter,
 * it acts as base presenter interface that is extended by all
 * presenter interfaces
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);
}
