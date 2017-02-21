package com.codeclan.example.atm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 21/02/2017.
 */

public class CustomerTest {
    Customer customer;

    @Before
    public void before(){
        customer = new Customer("John");
    }

    @Test
    public void testCustomerName(){
        assertEquals("John", customer.getName());
    }

    @Test
    public void testInitialWalletAmount(){
        assertEquals(0, customer.getWallet());
    }
}
