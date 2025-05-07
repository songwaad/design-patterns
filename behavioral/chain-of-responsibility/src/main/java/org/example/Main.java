package org.example;

import org.example.handler.concrete_handler.AccountBalanceValidate;
import org.example.handler.concrete_handler.CreditCardValidate;
import org.example.handler.concrete_handler.OTPValidate;
import org.example.handler.concrete_handler.PaymentApprove;

public class Main {
    public static void main(String[] args) {
        CreditCardValidate h1 = new CreditCardValidate();
        AccountBalanceValidate h2 = new AccountBalanceValidate();
        OTPValidate h3 = new OTPValidate();
        PaymentApprove h4 = new PaymentApprove();

        h1.setNext(h2).setNext(h3).setNext(h4);

        h1.pay("credit-card");
        h1.pay("banking");
        h1.pay("mobile-banking");
    }
}