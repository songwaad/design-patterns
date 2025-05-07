package org.example.element;

import org.example.visitor.Visitor;

public class Car implements Vehicle{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCar(this);
    }
}
