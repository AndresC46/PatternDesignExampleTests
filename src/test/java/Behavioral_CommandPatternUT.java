import BehavioralPatterns.CommandPattern.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Encapsulate a request under an object as a command and pass it to invoker object.
 * Invoker object looks for the appropriate object which can handle this command and
 * pass the command to the corresponding object and that object executes the command
 *
 * Advantage of command pattern
 * It separates the object that invokes the operation from the object that actually performs the operation.
 * It makes easy to add new commands, because existing classes remain unchanged.
 *
 * It is used:
 * When you need parameterize objects according to an action perform.
 * When you need to create and execute requests at different times.
 * When you need to support rollback, logging or transaction functionality.
 */
public class Behavioral_CommandPatternUT {

    @Test
    public void givenNewDoc_whenAddClickOpen_thenDocOpens(){
        Document doc = new Document();
        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);
        assertTrue(menu.clickOpen());
    }

    @Test
    public void givenNewDoc_whenAddClickSave_thenDocSaved(){
        Document doc = new Document();
        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);
        assertTrue(menu.clickSave());
    }

} // end class
