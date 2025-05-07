package org.example;

import org.example.colleague.Alarm;
import org.example.colleague.Breaker;
import org.example.colleague.Elevator;
import org.example.colleague.Sprinkler;
import org.example.mediator.EmegencyControl;

public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Breaker breaker = new Breaker();
        Elevator elevator = new Elevator();
        Sprinkler sprinkler = new Sprinkler();

        EmegencyControl emegencyControl = new EmegencyControl(alarm, breaker, elevator, sprinkler);


        alarm.trigger();
        System.out.println(" ");

        sprinkler.detectSmoke();
        System.out.println(" ");

        breaker.breakAlarm();
        System.out.println(" ");

        elevator.active();
    }
}