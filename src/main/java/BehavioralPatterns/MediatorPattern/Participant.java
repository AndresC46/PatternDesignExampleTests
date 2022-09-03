package BehavioralPatterns.MediatorPattern;

/**
 * Defines an interface for the users involved in chatting.
 */
public abstract class Participant {
    public abstract void sendMsg(String msg);
    public abstract void setname(String name);
    public abstract String getName();
}
