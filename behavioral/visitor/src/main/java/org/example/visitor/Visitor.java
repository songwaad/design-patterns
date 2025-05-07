package org.example.visitor;

import org.example.element.Car;
import org.example.element.Motorcycle;
import org.example.element.Truck;

public interface Visitor {
    public void visitMotorcycle(Motorcycle motocycle);
    public void visitCar(Car car);
    public void visitTruck(Truck truck);
}
