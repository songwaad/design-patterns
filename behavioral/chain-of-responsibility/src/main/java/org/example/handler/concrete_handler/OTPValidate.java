package org.example.handler.concrete_handler;

import org.example.handler.Payment;

public class OTPValidate extends Payment {
    @Override
    public void pay(String info) {
        if(info == "mobile-banking" || info == "credit-card" ) System.out.println(info + " : OTP Validate");
        super.pay(info);
    }
}
