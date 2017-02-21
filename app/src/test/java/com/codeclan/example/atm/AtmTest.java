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

    @Test
    public void testWithdraw(){
        try {
            int cash = atm.withdraw(250);
            customer.addToWallet(cash);

            assertEquals(250, cash);
            assertEquals(250, customer.getWallet());
            assertEquals(750, atm.getCashReserves());

            cash = atm.withdraw(100);
            customer.addToWallet(cash);
            assertEquals(100, cash);
            assertEquals(350, customer.getWallet());
            assertEquals(650, atm.getCashReserves());

        } catch (NotEnoughCashReservesException e) {
            e.printStackTrace();
        } catch (GreaterThanMaxWithdrawalException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = GreaterThanMaxWithdrawalException.class)
    public void testWithdrawTooMuch() throws NotEnoughCashReservesException, GreaterThanMaxWithdrawalException {
        int cash = atm.withdraw(500);
    }

    @Test(expected = NotEnoughCashReservesException.class)
    public void testWithdrawGreaterThanReserves() throws NotEnoughCashReservesException, GreaterThanMaxWithdrawalException {
        for(int i=0; i<=4; i++){
            atm.withdraw(250);
        }
    }

    @Test
    public void testFillUp(){
        try {
            atm.withdraw(200);

            assertEquals(800, atm.getCashReserves());

            atm.fillUp();

            assertEquals(1000, atm.getCashReserves());

        } catch (NotEnoughCashReservesException e) {
            e.printStackTrace();
        } catch (GreaterThanMaxWithdrawalException e) {
            e.printStackTrace();
        }

    }
}
