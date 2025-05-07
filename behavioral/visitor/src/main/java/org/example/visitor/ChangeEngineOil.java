package org.example.visitor;

import org.example.element.Car;
import org.example.element.Motorcycle;
import org.example.element.Truck;

public class ChangeEngineOil implements Visitor {
    @Override
    public void visitMotorcycle(Motorcycle motocycle) {
        System.out.println("Motorcycle : ChangeEngineOil");
    }

    @Override
    public void visitCar(Car car) {
        System.out.println("Car : ChangeEngineOil");
    }

    @Override
    public void visitTruck(Truck truck) {
        System.out.println("Truck : ChangeEngineOil");
    }
}
