package org.example.colleague;

import org.example.mediator.BuildingControl;

public class Breaker extends BuildingSystem{
    public Breaker() {
        setName("breaker");
    }

    public void breakAlarm() {
        System.out.println(getName() + " : breakAlarm");
        buildingControl.notifys(this, "break-alarm");
    }

    public String getName() {
        return "breaker";
    }
}
