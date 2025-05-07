package org.example.caretaker;

import org.example.memento.Memento;
import org.example.originator.Tactic;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Caretaker {
    private Stack<Memento> history;
    private Tactic tactic;

    public Caretaker(Tactic tactic) {
        this.history = new Stack<>();
        this.tactic = tactic;
    }

    public void addHistory() {
        history.add(tactic.saveMemento());
    }

    public void undo() {
        if(history.empty()) return;
        Memento memento = history.pop();
        tactic.restoreTo(memento);
    }

    public void showHistory() {
        System.out.println("History");
        Iterator<Memento> iterator = history.iterator();
        while (iterator.hasNext()) {
            iterator.next().show();
        }
    }
}
