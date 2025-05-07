package org.example.decorator;

import org.example.Training;

public class DesertTraining extends TrainingDecorator {

    public DesertTraining(Training training) {
        super(training);
    }

    public void addDesertTraining() {
        System.out.println(":: Desert Training");
    }

    @Override
    public void train() {
        super.train();
        addDesertTraining();
    }
}
