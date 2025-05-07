package org.example.state;

import org.example.context.Patient;

public abstract class States {
    protected Patient patient;
    protected String name;

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getName() {
        return name;
    }

    public abstract void stable();

    public abstract void pain(int level) ;

    public abstract void infect();

    public abstract void stopBreathing();
}
