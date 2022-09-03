package BehavioralPatterns.MediatorPattern;

/**
 * Defines the interface for interacting with participants.
 */
public interface ApnaChatRoom {
    public void showMsg(String msg, Participant p);
}
