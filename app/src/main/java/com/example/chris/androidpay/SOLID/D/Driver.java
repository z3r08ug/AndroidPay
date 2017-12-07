package com.example.chris.androidpay.SOLID.D;

/**
 * Created by chris on 12/6/2017.
 */

public class Driver
{
    
    private Vehicle vehicle;
    
    public Driver(final Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }
    
    public void increaseSpeed(){
        vehicle.accelerate();
    }
}