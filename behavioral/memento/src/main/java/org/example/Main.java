package org.example;

import org.example.caretaker.Caretaker;
import org.example.originator.Tactic;

public class Main {
    public static void main(String[] args) {
        Tactic tactic = new Tactic("Real Madrid", "4-3-3", "Pressing");
        Caretaker caretaker = new Caretaker(tactic);
        caretaker.addHistory();
        tactic.setFormation("4-2-3-1");
        tactic.setStrategy("Counter-Attack");
        caretaker.addHistory();
        tactic.setFormation("5-3-2");
        tactic.setStrategy("Park-The-Bus");
        caretaker.addHistory();

        caretaker.showHistory();

        caretaker.undo();
        tactic.show();

        caretaker.undo();
        tactic.show();

        caretaker.undo();
        tactic.show();

        caretaker.undo();
        tactic.show();

    }
}