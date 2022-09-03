package StructuralPatterns.BridgePattern;

import java.util.ArrayList;
import java.util.List;

public class XenobladeQuestions implements Question{
    private List<String> questions = new ArrayList<String>();
    private int current = 0;

    public XenobladeQuestions() {
        questions.add("Who is Rex? ");
        questions.add("Who is Mythra? ");
        questions.add("What is a Titan? ");
        questions.add("What is a Blade? ");
        questions.add("How do you chain attack? ");
        questions.add("How do you execute a combat art? ");
    }

    @Override
    public void nextQuestion() {
        if( current <= questions.size()-1 )
            current++;
        System.out.print(current);
    }

    @Override
    public void previousQuestion() {
        if( current > 0 )
            current--;
    }

    @Override
    public void newQuestion(String question) {
        questions.add(question);
    }

    @Override
    public void deleteQuestion(String question) {
        questions.remove(question);
    }

    @Override
    public void displayQuestion() {
        System.out.println( questions.get(current) );
    }

    @Override
    public void displayAllQuestions() {
        for (String quest : questions) {
            System.out.println(quest);
        }
    }

    @Override
    public List<String> retrieveAll() {
        return questions;
    }
}
