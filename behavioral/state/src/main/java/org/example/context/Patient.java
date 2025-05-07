package org.example.context;

import org.example.state.States;

public class Patient {
    private States state;

    public Patient(States state) {
        this.state = state;
        changeState(state);
        showState();
    }

    public void changeState(States state) {
        this.state = state;
        this.state.setPatient(this);
    }

    public void showState() {
        System.out.println("State : " + state.getName());
    }

    public void stable() {
        state.stable();
        showState();
    }

    public void pain(int level) {
        state.pain(level);
        showState();
    }

    public void infect() {
        state.infect();
        showState();
    }

    public void stopBreathing() {
        state.stopBreathing();
        showState();
    }
}
