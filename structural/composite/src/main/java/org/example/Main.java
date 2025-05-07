package org.example;

import org.example.composite.TeslaGroup;
import org.example.composite.leaf.Cybertruck;
import org.example.composite.leaf.ModelThree;
import org.example.composite.leaf.ModelS;

public class Main {
    public static void main(String[] args) {

        System.out.println("---- TESLA ----");

        TeslaGroup tesla = new TeslaGroup("Tesla");
        TeslaGroup sedan = new TeslaGroup("Sedan");
        TeslaGroup pickup = new TeslaGroup("Pickup");

        ModelThree modelThree = new ModelThree();
        ModelS modelS = new ModelS();
        Cybertruck cybertruck = new Cybertruck();

        tesla.add(sedan);
        tesla.add(pickup);
        tesla.getDetail();

        System.out.println("--- Add ---");

        sedan.add(modelThree);
        sedan.add(modelS);

        pickup.add(cybertruck);

        tesla.getDetail();
    }
}