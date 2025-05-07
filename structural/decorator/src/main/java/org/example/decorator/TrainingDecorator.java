package org.example.decorator;

import org.example.Training;

public class TrainingDecorator implements Training {

    private Training training;

    public TrainingDecorator(Training training) {
        this.training = training;
    }

    @Override
    public void train() {
        training.train();
    }
}
