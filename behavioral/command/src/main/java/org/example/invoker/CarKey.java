package org.example.invoker;

import org.example.command.Command;

public class CarKey {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
