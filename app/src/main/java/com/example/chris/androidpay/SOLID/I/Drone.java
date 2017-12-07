package com.example.chris.androidpay.SOLID.I;

/**
 * Created by chris on 12/6/2017.
 */

public class Drone extends Vehicle implements CameraSwitch
{
    
    private boolean cameraOn;
    
    public boolean isCameraOn()
    {
        return cameraOn;
    }
    
    @Override
    public void turnCameraOn()
    {
        cameraOn = true;
    }
    
    @Override
    public void turnCameraOff()
    {
        cameraOn = false;
    }
}