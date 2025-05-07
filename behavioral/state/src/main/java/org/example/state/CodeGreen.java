package org.example.state;

public class CodeGreen extends States{

    public CodeGreen() {
        this.name = "Code Green 🟢";
    }

    @Override
    public void stable() {

    }

    @Override
    public void pain(int level) {
        if(level >= 8) {
            patient.changeState(new CodeBlue());
        } else if (level >= 5) {
            patient.changeState(new CodeYellow());
        }
    }

    @Override
    public void infect() {
        patient.changeState(new CodeYellow());
    }

    @Override
    public void stopBreathing() {
        patient.changeState(new CodeRed());
    }
}
