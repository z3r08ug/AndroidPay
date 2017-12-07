package com.example.chris.androidpay.SOLID.I;

/**
 * Created by chris on 12/6/2017.
 */

public class Car extends Vehicle implements RadioSwitch
{
    
    private boolean radioOn;
    
    public boolean isRadioOn()
    {
        return radioOn;
    }
    
    @Override
    public void turnRadioOn()
    {
        radioOn = true;
    }
    
    @Override
    public void turnRadioOff()
    {
        radioOn = false;
    }
}