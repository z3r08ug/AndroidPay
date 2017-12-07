package com.example.chris.androidpay.SOLID.D;

/**
 * Created by chris on 12/6/2017.
 */

public class RaceCar implements Vehicle
{
    
    private final int maxFuel;
    private int remainingFuel;
    private int power;
    
    public RaceCar(final int maxFuel)
    {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }
    
    @Override
    public void accelerate()
    {
        power++;
        remainingFuel--;
    }
}