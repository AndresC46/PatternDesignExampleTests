import BehavioralPatterns.StrategyPattern.Addition;
import BehavioralPatterns.StrategyPattern.Multiplication;
import BehavioralPatterns.StrategyPattern.StrategyContext;
import BehavioralPatterns.StrategyPattern.Subtraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A Strategy Pattern:
 * Defines a family of functionality, encapsulate each one, and make them interchangeable.
 *
 * The Strategy Pattern is also known as Policy.
 *
 * Benefits:
 *    It provides a substitute to subclassing.
 *    It defines each behavior within its own class, eliminating the need for conditional statements.
 *    It makes it easier to extend and incorporate new behavior without changing the application.
 *
 * Usage:
 *    When the multiple classes differ only in their behaviors.e.g. Servlet API.
 *    It is used when you need different variations of an algorithm.
 */
public class Behavioral_StrategyPatternUT {

    @Test
    public void givenContext_whenAskStrategyTypeAdd_thenCheckAddResult(){
        float val1 = 3f;
        float val2 = 2f;

        StrategyContext context = new StrategyContext(new Addition());
        float res = context.executeStrategy(val1, val2);
        System.out.println("\n*********************************");
        System.out.printf("Addition %.2f + %.2f = %.2f", val1, val2, res);
        System.out.println("");
        assertEquals(5f, res);
    }

    @Test
    public void givenContext_whenAskStrategyTypeSubtract_thenCheckSubtractResult(){
        float val1 = 3f;
        float val2 = 2f;

        StrategyContext context = new StrategyContext(new Subtraction());
        float res = context.executeStrategy(val1, val2);
        System.out.printf("Subtraction %.2f + %.2f = %.2f", val1, val2, res);
        System.out.println("");
        assertEquals(1f, res);
    }

    @Test
    public void givenContext_whenAskStrategyTypeMultiply_thenCheckMultiplyResult(){
        float val1 = 3f;
        float val2 = 2f;

        StrategyContext context = new StrategyContext(new Multiplication());
        float res = context.executeStrategy(val1, val2);
        System.out.printf("Multiplication %.2f + %.2f = %.2f", val1, val2, res);
        System.out.println("\n*********************************\n");
        assertEquals(6f, res);
    }

}  // enc class
