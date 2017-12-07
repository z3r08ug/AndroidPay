package com.example.chris.androidpay.SOLID.S;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by chris on 12/6/2017.
 */
public class GamingSystemTest
{
    GamingSystem g;
    
    @Before
    public void setup()
    {
        g = mock(GamingSystem.class);
    }
    
    @Test
    public void play_should_reduce_battery()
    {
        g = new GamingSystem(100);
        assertEquals(g.play(), -1);
    }
    
    @After
    public void tearDown()
    {
    
    }
    
    
}