package org.example.handler;

public class Payment implements PaymentHandler{
    private PaymentHandler nextHandler;

    @Override
    public PaymentHandler setNext(PaymentHandler paymentHandler) {
        nextHandler = paymentHandler;
        return nextHandler;
    }

    @Override
    public void pay(String info) {
        if(nextHandler != null) {
            nextHandler.pay(info);
        }
    }
}
