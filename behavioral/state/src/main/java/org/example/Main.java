package org.example;

import org.example.context.Patient;
import org.example.state.CodeGreen;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient(new CodeGreen());

        System.out.println("\nThe patient's condition is stable.");
        patient.stable();

        System.out.println("\nThe patient's Infected.");
        patient.infect();

        System.out.println("\nThe patient stopped breathing.");
        patient.stopBreathing();

        System.out.println("\nThe patient's condition is stable.");
        patient.stable();

        System.out.println("\nThe patient's Infected.");
        patient.infect();

        System.out.println("\nThe patient's condition is stable.");
        patient.stable();

        System.out.println("\nThe Patient with pain level 7");
        patient.pain(7);

        System.out.println("\nThe Patient with pain level 9");
        patient.pain(9);

        System.out.println("\nThe patient's condition is stable.");
        patient.stable();

        System.out.println("\nThe patient's condition is stable.");
        patient.stable();

    }
}