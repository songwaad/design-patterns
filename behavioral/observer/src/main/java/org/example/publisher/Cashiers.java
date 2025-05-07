package org.example.publisher;

public class Cashiers implements Observer {
    @Override
    public void update(String order) {
        System.out.println("Cashiers : " + order);
    }
}
