import BehavioralPatterns.MementoPattern.Caretaker;
import BehavioralPatterns.MementoPattern.Originator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The Memento Pattern:
 * "Can restore the state of an object to its previous state".
 *  However,  it must do this without violating Encapsulation.
 *  Such case is useful in case of error or failure.
 *
 *  Benefits:
 *    It preserves encapsulation boundaries.
 *    It simplifies the originator.
 *
 *  Usage:
 *    It is used in Undo and Redo operations in most software.
 *    It is also used in database transactions.
 *
 */
public class Behavioral_MementoPatternUT {
    Originator originator = new Originator();
    Caretaker careTaker = new Caretaker();
    String currentState = "";

    @Test
    public void givenOriginator_whenFourStatesSet_thenMementoProvidesCurrentState(){
        // Set Originator states to four states
        setOriginatorStates();

        // Check Current State of Originator
        currentState = originator.getState();
        System.out.println("Current State: " + currentState);
        assertEquals("State #4", currentState);
    }

    @Test
    public void givenOriginatorWithFourStates_whenRecallFirstState_thenOriginatorAtFirstState(){
        // Set Originator states to four states
        setOriginatorStates();

        // Recall First State stored in Memento and set at Originator
        originator.getStateFromMemento(careTaker.get(0));
        currentState = originator.getState();
        System.out.println("Current State: " + currentState);
        assertEquals("State #1", currentState);
    }

    @Test
    public void givenOriginatorWithFourStates_whenRecallThirdState_thenOriginatorAtThirdState(){
        // Set Originator states to four states
        setOriginatorStates();

        // Recall Third State stored in Memento and set at Originator
        originator.getStateFromMemento(careTaker.get(2));
        currentState = originator.getState();
        System.out.println("Current State: " + currentState);
        assertEquals("State #3", currentState);
    }

    /**
     * Method set Originator states to four states sequentially
     */
    private void setOriginatorStates() {
        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");
    }


} // end class
