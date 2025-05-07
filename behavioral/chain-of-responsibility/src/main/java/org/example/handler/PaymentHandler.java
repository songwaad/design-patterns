package org.example.handler;

public interface PaymentHandler {
    public PaymentHandler setNext(PaymentHandler paymentHandler);
    public void pay(String info);
}
