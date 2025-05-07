package org.example.element;

import org.example.visitor.Visitor;

public class Truck implements Vehicle{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitTruck(this);
    }
}
