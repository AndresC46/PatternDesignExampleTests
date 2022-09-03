package BehavioralPatterns.ObserverPattern;

public abstract class ObserverObj {
    protected SubjectObserver subject;
    public abstract void update();
    public abstract String getState();
} // end class
