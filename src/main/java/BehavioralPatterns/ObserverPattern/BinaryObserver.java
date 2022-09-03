package BehavioralPatterns.ObserverPattern;

public class BinaryObserver extends ObserverObj{

    public BinaryObserver(SubjectObserver subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }

    @Override
    public String getState() {
        return String.valueOf(subject.getState());
    }

}
