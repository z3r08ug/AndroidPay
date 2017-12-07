package com.example.chris.androidpay.mainactivity;


import com.example.chris.androidpay.util.BasePresenter;
import com.example.chris.androidpay.util.BaseView;

import java.util.Map;

/**
 * Created by Admin on 11/29/2017.
 */

public interface MainActivityContract
{
    //methods for main activity
    interface View extends BaseView
    {
       void showProgress(String progress);
    }

    interface Presenter extends BasePresenter<View>
    {
    
    }
}
