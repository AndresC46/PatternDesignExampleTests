import StructuralPatterns.BridgePattern.JavaQuestions;
import StructuralPatterns.BridgePattern.QuestionFormat;

import StructuralPatterns.BridgePattern.XenobladeQuestions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

/**
 * Sample test class for using a Bridge Pattern
 * Bridge Pattern: says that just "decouple the functional abstraction from the
 * implementation so that the two can vary independently".
 *
 * The Bridge Pattern is also known as Handle or Body.
 *
 * It enables the separation of implementation from the interface.
 * It improves the extensibility.
 * It allows the hiding of implementation details from the client.
 */
public class Structural_BridgePatternUT {
    List<String> expectedQuestions = new ArrayList<String>();


    @Test
    public void givenJavaQuestions_whenRetrieved_thenExpectedQuestionsPresent(){
        // Instantiate questions object
        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.question = new JavaQuestions();

        // Retrieve list of questions
        List<String> javaQuestions = questions.retrieveAll();
        questions.displayAll();

        // Verify that return questions are as expected
        buildExpectedQuestions();
        assertEquals(expectedQuestions, javaQuestions);
    }

    @Test
    public void givenJavaQuestions_whenAddNewQuestion_thenExpectedQuestionsPresent(){
        // Instantiate questions object
        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.question = new JavaQuestions();

        // Add a new Question to Catalog and to expected questions
        questions.newOne("what is inheritance");
        buildExpectedQuestions();
        expectedQuestions.add("what is inheritance");

        // Retrieve list of questions
        List<String> javaQuestions = questions.retrieveAll();

        // Verify that return questions are as expected
        assertEquals(expectedQuestions, javaQuestions);

    }

    @Test
    public void givenJavaQuestions_whenDeleteQuestion_thenExpectedQuestionsPresent(){
        // Instantiate questions object
        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.question = new JavaQuestions();

        // Add a new Question to Catalog and to expected questions
        questions.delete("What is abstraction?");
        buildExpectedQuestions();
        expectedQuestions.remove("what is inheritance");

        // Retrieve list of questions
        List<String> javaQuestions = questions.retrieveAll();

        // Verify that return questions are as expected
        assertEquals(expectedQuestions, javaQuestions);

    }

    @Test
    public void givenXenobladeQuestions_whenRetrieved_thenExpectedQuestionsPresent(){
        // Instantiate questions object
        QuestionFormat questions = new QuestionFormat("Xenoblade Questions");
        questions.question = new XenobladeQuestions();

        // Retrieve list of questions
        List<String> xenobladeQuestions = questions.retrieveAll();
        questions.displayAll();

        // Verify that return questions are as expected
        buildXenobladeExpectedQuestions();
        assertEquals(expectedQuestions, xenobladeQuestions);
    }

    @Test
    public void givenXenobladeQuestions_whenAddNewQuestion_thenExpectedQuestionsPresent() {
        // Instantiate questions object
        QuestionFormat questions = new QuestionFormat("Xenoblade Questions");
        questions.question = new XenobladeQuestions();

        // Add a new Question to Catalog and to expected questions
        questions.newOne("Where is MorArdain");
        buildXenobladeExpectedQuestions();
        expectedQuestions.add("Where is MorArdain");

        // Retrieve list of questions
        List<String> javaQuestions = questions.retrieveAll();

        // Verify that return questions are as expected
        assertEquals(expectedQuestions, javaQuestions);
    }

        /**
         * Populate expected Java Questions list
         */
    public void buildExpectedQuestions(){
        expectedQuestions.add("What is class? ");
        expectedQuestions.add("What is interface? ");
        expectedQuestions.add("What is abstraction? ");
        expectedQuestions.add("How multiple polymorphism is achieved in java? ");
        expectedQuestions.add("How many types of exception  handling are there in java? ");
        expectedQuestions.add("Define the keyword final for  variable, method, and class in java? ");
        expectedQuestions.add("What is abstract class? ");
        expectedQuestions.add("What is multi-threading? ");
    }

    /**
     * Populate expected Xenoblade Questions list
     */
    public void buildXenobladeExpectedQuestions(){
        expectedQuestions.add("Who is Rex? ");
        expectedQuestions.add("Who is Mythra? ");
        expectedQuestions.add("What is a Titan? ");
        expectedQuestions.add("What is a Blade? ");
        expectedQuestions.add("How do you chain attack? ");
        expectedQuestions.add("How do you execute a combat art? ");
    }

    /**
     * Remove all elements from expected questions list
     */
    public void clearExpectedQuestions(){
        expectedQuestions.clear();
    }


}
