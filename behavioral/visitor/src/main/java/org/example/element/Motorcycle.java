package org.example.element;

import org.example.visitor.Visitor;

public class Motorcycle implements Vehicle{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMotorcycle(this);
    }
}
