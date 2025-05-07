package org.example.element;

import org.example.visitor.Visitor;

public interface Vehicle {
    public void accept(Visitor visitor);
}
