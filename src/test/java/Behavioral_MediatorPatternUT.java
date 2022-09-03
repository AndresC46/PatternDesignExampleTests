import BehavioralPatterns.MediatorPattern.ApnaChatRoom;
import BehavioralPatterns.MediatorPattern.ApnaChatRoomImpl;
import BehavioralPatterns.MediatorPattern.User1;
import BehavioralPatterns.MediatorPattern.User2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Mediator pattern is used to reduce communication complexity between multiple objects
 * or classes. This pattern provides a mediator class which normally handles all the
 * communications between different classes and supports easy maintainability of the
 * code by loose coupling.
 *
 * Benefits:
 * It decouples the number of classes.
 * It simplifies object protocols.
 * It centralizes the control.
 *   The individual components become simpler and much easier to deal with because
 *      they don't need to pass messages to one another.
 *   The components don't need to contain logic to deal with their intercommunication
 *      and therefore, they are more generic.
 *
 * It is commonly used in message-based systems likewise chat applications.
 * When the set of objects communicate in complex but in well-defined ways.
 *
 */
public class Behavioral_MediatorPatternUT {

    @Test
    public void givenApnaChat_whenUser1StartsChat_thenUser2SendsResponse(){
        // Instantiate CHat Room
        ApnaChatRoom chat = new ApnaChatRoomImpl();

        // User 1 Instantiated and Sends initial Message
        System.out.println("");
        User1 u1 = new User1(chat);
        u1.setname("Ash Ketchum");
        u1.sendMsg("Hi Ashwani! how are you?");


        // User 2 Instantiated and Sends Response Message
        User2 u2 = new User2(chat);
        u2.setname("Wako Shaman");
        u2.sendMsg("I am Fine ! You tell?");
        System.out.println("");

        assertEquals("Ash Ketchum", u1.getName());
        assertEquals("Wako Shaman", u2.getName());
    }
}
