package org.example;

import org.example.adaptee.EURPocket;
import org.example.adaptee.USDPocket;
import org.example.adapter.EURAdapter;
import org.example.adapter.USDAdapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("International drug cartel 💊");

        EURPocket eurPocket = new EURPocket(100);
        System.out.println(eurPocket.toString());

        USDPocket usdPocket = new USDPocket(200);
        System.out.println(usdPocket.toString());

        System.out.println("\nWelcom to Thailand 😀");

        double amount;
        EURAdapter eurAdapter = new EURAdapter(eurPocket);
        USDAdapter usdAdapter = new USDAdapter(usdPocket);
        amount = usdAdapter.getBaht() + eurAdapter.getBaht();

        System.out.println("Amount : " + amount + " ฿");
    }
}