package com.codeclan.example.atm;

/**
 * Created by user on 21/02/2017.
 */

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AtmTest {
    Customer customer;
    Atm atm;

    @Before
    public void before(){
        this.customer = new Customer("John");
        this.atm = new Atm("High Street");
    }

    @Test
    public void testLocation(){
        assertEquals("High Street", atm.getLocation());
    }

    @Test
    public void testInitialReserves(){
        assertEquals(1000, atm.getCashReserves());
    }

    @Test
    public void testMaxWithdrawal(){
        assertEquals(250, atm.getMaxWithdrawal());
    }
}
