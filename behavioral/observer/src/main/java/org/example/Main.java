package org.example;

import org.example.observer.OrderSystem;
import org.example.publisher.Cashiers;
import org.example.publisher.Kitchen;
import org.example.publisher.Waiters;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Cashiers cashiers = new Cashiers();
        Waiters waiters = new Waiters();

        OrderSystem orderSystem = new OrderSystem();
        orderSystem.subscribe(kitchen);
        orderSystem.subscribe(cashiers);
        orderSystem.subscribe(waiters);

        orderSystem.setOrder("Pad Thai, Table 1");
        System.out.print("\n");

        orderSystem.setOrder("Pad Thai, Som Tum, Table 2");
        System.out.print("\n");

        orderSystem.setOrder("Khao Pad, Table 3");
        System.out.print("\n");

        orderSystem.unSubscribe(waiters);
        orderSystem.setOrder("Tom Yum Goong, Table 5");
        System.out.print("\n");

    }
}