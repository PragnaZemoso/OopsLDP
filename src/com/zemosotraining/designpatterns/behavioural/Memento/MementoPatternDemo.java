package com.zemosotraining.designpatterns.behavioural.Memento;

import java.util.ArrayList;

/**
 * Memento class that will Store internal state of the Originator object.
 */
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

/**
 * Originator class that will use Memento object to restore its previous state.
 */
class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }

    public Memento saveStateToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }

    /**
     * getCheckpointFromMemento - rollback
     * @param memento: saved memento
     */
    public void getCheckpointFromMemento(Memento memento) {
        state = memento.getState();
    }
}

/**
 * Caretaker class that will responsible for keeping the Memento
 */

class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento mem) {
        mementos.add(mem);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}


public class MementoPatternDemo {

    public static void main(String[] args) {

        Originator originator = new Originator();

        Caretaker careTaker = new Caretaker();

        originator.setState("State #1");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #2");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #4"); // state is not saved
        System.out.println("Current State of Originator object: " + originator.getState());

        originator.getCheckpointFromMemento(careTaker.getMemento(0)); // moved to checkpoint of state #1 --> undo state #4 change of originator
        System.out.println("First saved State: " + originator.getState());
        originator.getCheckpointFromMemento(careTaker.getMemento(1));
        System.out.println("Second saved State: " + originator.getState());
        originator.getCheckpointFromMemento(careTaker.getMemento(2));
        System.out.println("Third saved State: " + originator.getState());

        originator.getCheckpointFromMemento(careTaker.getMemento(1)); // moved to checkpoint of state #2
        System.out.println("Current State of Originator object: " + originator.getState());
        originator.getCheckpointFromMemento(careTaker.getMemento(0)); // moved to checkpoint of state #1
        System.out.println("Current State of Originator object: " + originator.getState());

    }

}
