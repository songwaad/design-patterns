package org.example.command;

import org.example.receiver.ECU;

public class TurnOnAir implements Command{
    private ECU ecu;

    public TurnOnAir(ECU ecu) {
        this.ecu = ecu;
    }

    @Override
    public void execute() {
        ecu.turnOnAir();
    }
}
