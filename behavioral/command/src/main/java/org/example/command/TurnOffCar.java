package org.example.command;

import org.example.receiver.ECU;

public class TurnOffCar implements Command{
    private ECU ecu;

    public TurnOffCar(ECU ecu) {
        this.ecu = ecu;
    }

    @Override
    public void execute() {
        ecu.turnOffCar();
    }
}
