package com.example.chris.androidpay.di.mainactivity;


import com.example.chris.androidpay.mainactivity.MainActivityPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 11/29/2017.
 */

@Module
public class MainActivityModule
{
    @Provides
    @Singleton
    MainActivityPresenter mainActivityPresenter()
    {
        return new MainActivityPresenter();
    }
}
