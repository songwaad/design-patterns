package org.example.publisher;

public class Kitchen implements Observer {
    @Override
    public void update(String order) {
        System.out.println("Kitchen : " + order);
    }
}
