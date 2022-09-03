package BehavioralPatterns.ObserverPattern;

public class HexaObserver extends ObserverObj {

    public HexaObserver(SubjectObserver subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }

    @Override
    public String getState() {
        return String.valueOf(subject.getState());
    }

} // end
