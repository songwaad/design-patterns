package org.example.state;

public class CodeBlue extends States{

    public CodeBlue() {
        this.name = "Code Blue 🔵";
    }

    @Override
    public void stable() {
        patient.changeState(new CodeYellow());
    }

    @Override
    public void pain(int level) {
        if(level >= 8) {
            patient.changeState(new CodeRed());
        }
    }

    @Override
    public void infect() {
        patient.changeState(new CodeRed());
    }

    @Override
    public void stopBreathing() {
        patient.changeState(new CodeRed());
    }
}
