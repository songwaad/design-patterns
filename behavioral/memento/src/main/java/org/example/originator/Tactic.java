package org.example.originator;

import org.example.memento.Memento;
import org.example.memento.TacticMemento;

public class Tactic {
    private String team;
    private String formation;
    private String strategy;

    public Tactic(String team, String formation, String strategy) {
        this.team = team;
        this.formation = formation;
        this.strategy = strategy;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public Memento saveMemento() {
        return new TacticMemento(formation, strategy);
    }

    public void restoreTo(Memento memento) {
        TacticMemento tacticMemento = (TacticMemento) memento;
        setFormation(tacticMemento.getFormation());
        setStrategy(tacticMemento.getStrategy());
    }

    public void show() {
        System.out.println("Tactic{" +
                "team='" + team + '\'' +
                ", formation='" + formation + '\'' +
                ", strategy='" + strategy + '\'' +
                '}');
    }
}
