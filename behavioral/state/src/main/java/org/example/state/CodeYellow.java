package org.example.state;

public class CodeYellow extends States{

    public CodeYellow() {
        this.name = "Code Yellow \uD83D\uDFE1️";
    }

    @Override
    public void stable() {
        patient.changeState(new CodeGreen());
    }

    @Override
    public void pain(int level) {
        if(level >= 9) {
            patient.changeState(new CodeRed());
        } else if(level >= 7) {
            patient.changeState(new CodeBlue());
        }
    }

    @Override
    public void infect() {
        patient.changeState(new CodeBlue());
    }

    @Override
    public void stopBreathing() {
        patient.changeState(new CodeRed());
    }
}
