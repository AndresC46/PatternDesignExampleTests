package StructuralPatterns.BridgePattern;


import java.util.List;

/**
 * This is a Bridge that uses the Question interface
 */
public class QuestionManager {
    public Question question;  // Question Interface
    public String catalog;

    public QuestionManager(String catalog) {
        this.catalog=catalog;
    }

    public void next() { question.nextQuestion();}

    public void previous() { question.previousQuestion(); }

    public void newOne(String quest) { question.newQuestion(quest); }

    public void delete(String quest) { question.deleteQuestion(quest); }

    public void display() { question.displayQuestion(); }

    public void displayAll() {
        System.out.println("Question Paper: " + catalog);
        question.displayAllQuestions();
    }

    // Retrieves list of questions from catalog
    public List<String> retrieveAll() {
        return question.retrieveAll();
    }
}
