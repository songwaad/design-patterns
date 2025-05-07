package org.example.handler.concrete_handler;

import org.example.handler.Payment;

public class PaymentApprove extends Payment {
    @Override
    public void pay(String info) {
        System.out.println(info + " : Payment Approve");
        super.pay(info);
    }
}
