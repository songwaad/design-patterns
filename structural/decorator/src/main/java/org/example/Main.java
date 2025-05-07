package org.example;

import org.example.decorator.AirTraining;
import org.example.decorator.DesertTraining;
import org.example.decorator.HorseRidingTraining;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Pentagon Has Fallen ---");

        Training basicTraining = new BasicTraining("Seal Team Six");
        basicTraining.train();

        Training addAirTraining = new AirTraining(basicTraining);
        addAirTraining.train();

        Training addAirTrainingAndDesertTraining = new DesertTraining(addAirTraining);
        addAirTrainingAndDesertTraining.train();

        Training addAirTrainingAndDesertTrainingAndHorseRidingTraining = new HorseRidingTraining(addAirTrainingAndDesertTraining);
        addAirTrainingAndDesertTrainingAndHorseRidingTraining.train();
    }
}