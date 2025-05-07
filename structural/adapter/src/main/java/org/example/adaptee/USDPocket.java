package org.example.adaptee;

public class USDPocket {
    private double amount;

    public USDPocket(float amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "USDPocket{" +
                "amount=" + amount +
                '}';
    }
}
