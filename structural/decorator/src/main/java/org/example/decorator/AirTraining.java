package org.example.decorator;

import org.example.Training;

public class AirTraining extends TrainingDecorator {

    public AirTraining(Training training) {
        super(training);
    }

    public void addAirTraining() {
        System.out.println(":: Air Training");
    }

    @Override
    public void train() {
        super.train();
        addAirTraining();
    }
}
