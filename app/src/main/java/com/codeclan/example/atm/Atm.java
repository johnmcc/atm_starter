package com.codeclan.example.atm;

/**
 * Created by user on 21/02/2017.
 */

public class Atm {
    private int cashReserves;
    private String location;
    private int maxWithdrawal;

    public Atm(String location){
        this.cashReserves = 1000;
        this.location = location;
        this.maxWithdrawal = 250;
    }

    public String getLocation() {
        return location;
    }

    public int getCashReserves() {
        return cashReserves;
    }

    public int getMaxWithdrawal() {
        return maxWithdrawal;
    }
}
