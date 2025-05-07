package org.example;

import org.example.command.*;
import org.example.invoker.CarKey;
import org.example.receiver.ECU;

public class Main {
    public static void main(String[] args) {
        CarKey carKey = new CarKey();

        ECU ecu = new ECU();

        Command startCar = new StartCar(ecu);
        Command turnOffCar = new TurnOffCar(ecu);
        Command turnOnAir = new TurnOnAir(ecu);
        Command turnOffAir = new TurnOffAir(ecu);

        carKey.setCommand(startCar);
        carKey.executeCommand();

        carKey.setCommand(turnOnAir);
        carKey.executeCommand();

        carKey.setCommand(turnOffAir);
        carKey.executeCommand();

        carKey.setCommand(turnOffCar);
        carKey.executeCommand();
    }
}