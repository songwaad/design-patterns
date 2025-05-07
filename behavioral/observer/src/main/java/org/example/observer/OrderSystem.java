package org.example.observer;

import org.example.publisher.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderSystem {
    private List<Observer> observers;
    private String order;

    public OrderSystem() {
        this.observers = new ArrayList<>();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void setOrder(String order) {
        this.order = order;
        notifys();
    }

    public void notifys() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().update(order);
        }
    }
}
