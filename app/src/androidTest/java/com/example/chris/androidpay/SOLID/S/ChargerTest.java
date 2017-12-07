package com.example.chris.androidpay.SOLID.S;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;
import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by chris on 12/6/2017.
 */
public class ChargerTest
{
    Charger c;
    GamingSystem g;
    
    @Before
    public void setup()
    {
        c = mock(Charger.class);
        g = mock(GamingSystem.class);
    }
    
    
    
    @Test
    public void recharge_should_charge_battery()
    {
        c = new Charger();
        g = new GamingSystem(100);
        g.setRemainingBattery(80);
        assertEquals(c.recharge(g), 20);
    }
    @After
    public void tearDown()
    {
    
    }
    
}