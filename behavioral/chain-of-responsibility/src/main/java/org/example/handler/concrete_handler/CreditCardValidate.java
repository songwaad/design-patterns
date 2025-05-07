package org.example.handler.concrete_handler;

import org.example.handler.Payment;

public class CreditCardValidate extends Payment {
    @Override
    public void pay(String info) {
        if(info == "credit-card") System.out.println(info + " : Credit Card Validate");
        super.pay(info);
    }
}
