package com.example.chris.androidpay.SOLID.L;

/**
 * Created by chris on 12/6/2017.
 */

abstract class Animal
{
    
    private String name;
    private String type;
    
    public Animal(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    
    public void makeNoise(String noise)
    {
        System.out.println(noise);
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
}
