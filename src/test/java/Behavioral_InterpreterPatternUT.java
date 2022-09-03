import BehavioralPatterns.InterpreterPattern.InfixToPostfixPattern;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * This pattern can be applied for parsing the expressions defined in simple
 * grammars and sometimes in simple rule engines.
 *
 * Advantage of Interpreter Pattern
 * It is easier to change and extend the grammar.
 * Implementing the grammar is straightforward.
 *
 * Usage of Interpreter pattern:
 * It is used:
 * When the grammar of the language is not complicated.
 * When the efficiency is not a priority.
 */
public class Behavioral_InterpreterPatternUT {

    @Test
    public void givenAPattern_whenConverted_thenExpectedPattern(){
        String infix = "a+b*c";
        InfixToPostfixPattern ip = new InfixToPostfixPattern();

        assertEquals("abc*+", ip.conversion(infix));

    }

} // en class
