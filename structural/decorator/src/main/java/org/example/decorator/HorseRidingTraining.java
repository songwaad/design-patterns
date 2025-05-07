package org.example.decorator;

import org.example.Training;

public class HorseRidingTraining extends TrainingDecorator{

    public HorseRidingTraining(Training training) {
        super(training);
    }

    public void addHorseRidingTraining() {
        System.out.println(":: Horse Riding Training");
    }

    @Override
    public void train() {
        super.train();
        addHorseRidingTraining();
    }
}
