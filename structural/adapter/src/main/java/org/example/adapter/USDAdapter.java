package org.example.adapter;

import org.example.adaptee.USDPocket;

public class USDAdapter implements Baht{

    private USDPocket adaptee;

    public USDAdapter(USDPocket adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double getBaht() {
        return this.adaptee.getAmount() * 33.89 ;
    }
}
