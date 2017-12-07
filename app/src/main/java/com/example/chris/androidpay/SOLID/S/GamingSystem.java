package com.example.chris.androidpay.SOLID.S;

/**
 * Created by chris on 12/6/2017.
 */

public class GamingSystem
{
    private final int batteryMax;
    private int remainingBattery;
    
    public GamingSystem(final int batteryMax)
    {
        this.batteryMax = batteryMax;
    }
    
    public int play()
    {
        remainingBattery--;
        return remainingBattery;
    }
    
    public int getBatteryMax()
    {
        return batteryMax;
    }
    
    public int getRemainingBattery()
    {
        return remainingBattery;
    }
    
    public void setRemainingBattery(int remainingBattery)
    {
        this.remainingBattery = remainingBattery;
    }
}
