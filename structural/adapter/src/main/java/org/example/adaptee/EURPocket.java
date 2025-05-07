package org.example.adaptee;

public class EURPocket {
    private double amount;

    public EURPocket(float amount) {
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
        return "EURPocket{" +
                "amount=" + amount +
                '}';
    }
}
