package org.example.command;

import org.example.receiver.ECU;

public class TurnOffAir implements Command{
    private ECU ecu;

    public TurnOffAir(ECU ecu) {
        this.ecu = ecu;
    }

    @Override
    public void execute() {
        ecu.turnOffAir();
    }
}
