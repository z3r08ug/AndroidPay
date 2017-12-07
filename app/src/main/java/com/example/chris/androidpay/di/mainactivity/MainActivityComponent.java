package com.example.chris.androidpay.di.mainactivity;

import com.example.chris.androidpay.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Chris on 12/6/2017.
 */

@Component(modules = MainActivityModule.class)
@Singleton
public interface MainActivityComponent
{
    void inject(MainActivity mainActivity);
}
