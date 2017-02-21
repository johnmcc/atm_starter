package com.codeclan.example.atm;

/**
 * Created by user on 21/02/2017.
 */

public class Customer {
    private String name;
    private int wallet;

    public Customer(String name){
        this.name = name;
        this.wallet = 0;
    }

    public String getName() {
        return name;
    }

    public int getWallet(){
        return this.wallet;
    }

    public void addToWallet(int amount){
        wallet += amount;
    }
}
