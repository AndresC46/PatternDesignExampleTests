package StructuralPatterns.BridgePattern;

import java.util.List;

/**
 * This interface  provides the navigation from one question to another or vice-versa.
 */
public interface Question {
    public void nextQuestion();
    public void previousQuestion();
    public void newQuestion(String q);
    public void deleteQuestion(String q);
    public void displayQuestion();
    public void displayAllQuestions();

    List<String> retrieveAll();
}
