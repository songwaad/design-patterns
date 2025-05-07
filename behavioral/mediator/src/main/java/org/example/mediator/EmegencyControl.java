package org.example.mediator;

import org.example.colleague.*;

public class EmegencyControl implements BuildingControl {

    private Alarm alarm;
    private Breaker breaker;
    private Elevator elevator;
    private Sprinkler sprinkler;

    public EmegencyControl(Alarm alarm, Breaker breaker, Elevator elevator, Sprinkler sprinkler) {
        this.alarm = alarm;
        this.breaker = breaker;
        this.elevator = elevator;
        this.sprinkler = sprinkler;
        this.alarm.setBuildingControl(this);
        this.breaker.setBuildingControl(this);
        this.elevator.setBuildingControl(this);
        this.sprinkler.setBuildingControl(this);
    }

    @Override
    public void notifys(BuildingSystem sender, String event) {
        if (sender.getName() == "alarm" && event == "trigger") {}

        if (sender.getName() == "sprinkler" && event == "detect-smoke") {
            sprinklerDetectSmoke();
        }

        if (sender.getName() == "breaker" && event == "break-alarm") {
            breakAlarm();
        }

        if (sender.getName() == "elevator" && event == "active") {
            elevatorUnlock();
        }
    }

    public void sprinklerDetectSmoke() {
        alarm.trigger();
        elevator.lock();
    }

    public void breakAlarm() {
        alarm.trigger();
        sprinkler.activate();
        elevator.lock();
    }

    public void elevatorUnlock() {
        alarm.stop();
        sprinkler.stop();
    }
}
