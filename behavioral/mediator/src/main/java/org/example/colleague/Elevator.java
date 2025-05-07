package org.example.colleague;

import org.example.mediator.BuildingControl;

public class Elevator extends BuildingSystem {
    public Elevator() {
        setName("elevator");
    }

    public void lock() {
        System.out.println(getName() + " : Locked");
    }

    public void active() {
        System.out.println(getName() + " : active");
        buildingControl.notifys(this, "active");
    }
}
