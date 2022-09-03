package BehavioralPatterns.ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class SubjectObserver {
    private List<ObserverObj> observers = new ArrayList<ObserverObj>();
    private int state;

    public int getState() {return state;}
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(ObserverObj observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (ObserverObj observer : observers) {
            observer.update();
        }
    }


}  // end class
