package org.example.command;

import org.example.receiver.ECU;

public class StartCar implements Command{
    private ECU ecu;

    public StartCar(ECU ecu) {
        this.ecu = ecu;
    }

    @Override
    public void execute() {
        ecu.startCar();
    }
}
