package org.example.visitor;

import org.example.element.Car;
import org.example.element.Motorcycle;
import org.example.element.Truck;

public class VehicleInspection implements Visitor{
    @Override
    public void visitMotorcycle(Motorcycle motocycle) {
        System.out.println("Motorcycle : VehicleInspection");
    }

    @Override
    public void visitCar(Car car) {
        System.out.println("Car : VehicleInspection");
    }

    @Override
    public void visitTruck(Truck truck) {
        System.out.println("Truck : VehicleInspection");
    }
}
