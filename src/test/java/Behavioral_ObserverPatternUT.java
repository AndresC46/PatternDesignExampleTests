import BehavioralPatterns.ObserverPattern.BinaryObserver;
import BehavioralPatterns.ObserverPattern.HexaObserver;
import BehavioralPatterns.ObserverPattern.OctalObserver;
import BehavioralPatterns.ObserverPattern.SubjectObserver;
import org.junit.jupiter.api.Test;

import javax.security.auth.Subject;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *  Observer Pattern: "just define a one-to-one dependency so that when one object changes state,
 *  all its dependents are notified and updated automatically".
 *
 * The observer pattern is also known as Dependents or Publish-Subscribe.
 *
 * Benefits:
 *    It describes the coupling between the objects and the observer.
 *    It provides the support for broadcast-type communication.
 *
 * Usage:
 *    When the change of a state in one object must be reflected in another object without keeping the objects tight coupled.
 *    When the framework writes and needs to be enhanced in future with new observers with minimal chamges.
 */
public class Behavioral_ObserverPatternUT {
    @Test
    public void givenObservers_whenInitialState_thenCheckState(){
        SubjectObserver subject = new SubjectObserver();

        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        System.out.println("Initial state: 15");
        subject.setState(15);
        assertEquals("15", binaryObserver.getState());
        assertEquals("15", octalObserver.getState());
        assertEquals("15", hexaObserver.getState());

    }

    @Test
    public void given_when_then2(){
        SubjectObserver subject = new SubjectObserver();

        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
        assertEquals("10", binaryObserver.getState());
        assertEquals("10", octalObserver.getState());
        assertEquals("10", hexaObserver.getState());
    }
} //end class
