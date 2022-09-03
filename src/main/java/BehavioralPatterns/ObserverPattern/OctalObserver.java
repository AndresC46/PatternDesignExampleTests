package BehavioralPatterns.ObserverPattern;

public class OctalObserver extends ObserverObj {

    public OctalObserver(SubjectObserver subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }

    @Override
    public String getState() {
        return String.valueOf(subject.getState());
    }
}
