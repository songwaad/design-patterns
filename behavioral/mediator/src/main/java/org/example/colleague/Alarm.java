package org.example.colleague;

import org.example.mediator.BuildingControl;

public class Alarm extends BuildingSystem{
    public Alarm() {
        setName("alarm");
    }

    public void trigger() {
        System.out.println(getName() + " : trigger");
        buildingControl.notifys(this, "trigger");
    }

    public void stop() {
        System.out.println(getName() + " : stop");
    }
}
