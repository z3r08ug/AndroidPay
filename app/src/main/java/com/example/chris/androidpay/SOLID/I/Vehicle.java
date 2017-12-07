package com.example.chris.androidpay.SOLID.I;

/**
 * Created by chris on 12/6/2017.
 */

public abstract class Vehicle implements Ignition
{
    
    private boolean engineRunning;
    
    
    public boolean isEngineRunning()
    {
        return engineRunning;
    }
    
    @Override
    public void startEngine()
    {
        engineRunning=  true;
    }
    
    @Override
    public void shutDownEngine()
    {
        engineRunning = false;
    }
}
