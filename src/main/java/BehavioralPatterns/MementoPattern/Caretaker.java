package BehavioralPatterns.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will act as a care takes for the Memento Class
 */
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
