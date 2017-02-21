package com.codeclan.example.atm;

/**
 * Created by user on 21/02/2017.
 */
public class NotEnoughCashReservesException extends Exception {
    public NotEnoughCashReservesException(String message){
        super(message);
    }
}
