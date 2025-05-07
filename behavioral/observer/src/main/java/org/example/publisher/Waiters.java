package org.example.publisher;

public class Waiters implements Observer {
    @Override
    public void update(String order) {
        System.out.println("Waiters : " + order);
    }
}
