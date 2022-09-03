package BehavioralPatterns.MementoPattern;

/**
 * This class will Store internal state of the Originator object.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

} // end class
