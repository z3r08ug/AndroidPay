package com.example.chris.androidpay.mainactivity;

import android.util.Log;

import java.util.Map;
/**
 * Created by Admin on 11/29/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter
{
    MainActivityContract.View view;
    public static final String TAG = MainActivityPresenter.class.getSimpleName() + "_TAG";
    
    @Override
    public void attachView(MainActivityContract.View view)
    {
        this.view = view;
    }

    @Override
    public void detachView()
    {

    }
}
