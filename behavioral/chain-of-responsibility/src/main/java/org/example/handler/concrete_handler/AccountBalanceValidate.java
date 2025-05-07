package org.example.handler.concrete_handler;

import org.example.handler.Payment;

public class AccountBalanceValidate extends Payment {
    @Override
    public void pay(String info) {
        System.out.println(info + " : Account Balance Validate");
        super.pay(info);
    }
}
