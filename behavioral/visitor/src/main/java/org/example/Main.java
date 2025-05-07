package org.example;

import org.example.element.Car;
import org.example.element.Motorcycle;
import org.example.element.Truck;
import org.example.element.Vehicle;
import org.example.visitor.ChangeEngineOil;
import org.example.visitor.VehicleInspection;
import org.example.visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Motorcycle());
        vehicles.add(new Car());
        vehicles.add(new Truck());

        ChangeEngineOil changeEngineOil = new ChangeEngineOil();
        VehicleInspection vehicleInspection = new VehicleInspection();

        System.out.println("--- Change Engine Oil ---");
        client(vehicles, changeEngineOil);

        System.out.println("\n--- Vehicle Inspection ---");
        client(vehicles, vehicleInspection);


    }

    public static void client(List<Vehicle> vehicleList, Visitor visitor) {
        Iterator<Vehicle> iterator = vehicleList.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }
}