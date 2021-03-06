package com.strila.petproject.ui.base;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Serhii Strila on 1/11/17
 */

public abstract class BasePresenter<T extends BaseViewDelegate, R extends Router> implements BasePresenterDelegate {

    @NonNull protected CompositeDisposable disposables = new CompositeDisposable();
    @NonNull protected T view;
    @NonNull protected R router;

    public BasePresenter(@NonNull T view, @NonNull R router) {
        this.view = view;
        this.router = router;
    }

    @CallSuper
    @Override
    public void attach() {

    }

    @CallSuper
    @Override
    public void detach() {
        disposables.dispose();
    }

    @Override
    public void saveState(Bundle savedInstanceState) {

    }

    @Override
    public void restoreState(Bundle savedInstanceState) {

    }
}