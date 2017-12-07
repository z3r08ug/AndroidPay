package com.example.chris.androidpay.SOLID.S;

/**
 * Created by chris on 12/6/2017.
 */

public class Charger
{
    
    public int recharge(final GamingSystem gamingSystem)
    {
        final int remainingBattery = gamingSystem.getRemainingBattery();
        final int additionalCharge = gamingSystem.getBatteryMax() - remainingBattery;
        gamingSystem.setRemainingBattery(remainingBattery + additionalCharge);
        return additionalCharge;
    }
}