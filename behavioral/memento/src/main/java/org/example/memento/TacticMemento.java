package org.example.memento;

import java.sql.Time;

public class TacticMemento implements Memento {
    private String formation;
    private String strategy;

    public TacticMemento(String formation, String strategy) {
        this.formation = formation;
        this.strategy = strategy;
    }

    public String getFormation() {
        return formation;
    }

    public String getStrategy() {
        return strategy;
    }

    @Override
    public void show() {
        System.out.println("Formation : " + formation + ", Strategy : " + strategy);
    }
}
