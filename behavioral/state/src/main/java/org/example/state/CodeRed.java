package org.example.state;

public class CodeRed extends States{

    public CodeRed() {
        this.name = "Code Red 🔴";
    }

    @Override
    public void stable() {
        patient.changeState(new CodeYellow());
    }

    @Override
    public void pain(int level) {

    }

    @Override
    public void infect() {

    }

    @Override
    public void stopBreathing() {

    }
}
