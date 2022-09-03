import BehavioralPatterns.TemplatePattern.Game;
import BehavioralPatterns.TemplatePattern.Chess;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Template Pattern:
 * "just define the skeleton of a function in an operation,
 *  deferring some steps to its subclasses".
 *
 *  Benefits:
 *   It is very common technique for reusing code.  This is only the main benefit of it.
 *
 *  Usage:
 *   It is used when the common behavior among
 *   sub-classes should be moved to a single
 *   common class by avoiding the duplication.
 */
@SuppressWarnings("deprecation")
public class Behavioral_TemplatePatternUT {

    @Test
    public void givenGame_whenGameIsChess_thenGameIsPlayed(){
        Game game = null;
        Class c;

        try {
            c = Class.forName("Chess");
            game = (Game) c.newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        String res = game != null ? game.play() : "";
        assertEquals("Chess GameX", res);
    }

} // end class
