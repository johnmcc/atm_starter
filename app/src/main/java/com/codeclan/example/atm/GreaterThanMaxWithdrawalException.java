package com.codeclan.example.atm;

/**
 * Created by user on 21/02/2017.
 */
public class GreaterThanMaxWithdrawalException extends Exception {
    public GreaterThanMaxWithdrawalException(String message) {
        super(message);
    }
}
