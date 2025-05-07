package org.example.adapter;

import org.example.adaptee.EURPocket;

public class EURAdapter implements Baht {
    private EURPocket adaptee;

    public EURAdapter(EURPocket adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double getBaht() {
        return this.adaptee.getAmount() * 34.94;
    }
}
