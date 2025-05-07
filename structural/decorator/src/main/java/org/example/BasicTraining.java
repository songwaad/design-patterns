package org.example;

public class BasicTraining implements Training{

    private String team;

    public BasicTraining(String team) {
        this.team = team;
    }

    @Override
    public void train() {
        System.out.println("\n" + team);
        System.out.println(":: Basic Training");
    }
}
