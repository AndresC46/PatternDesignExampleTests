package BehavioralPatterns.CommandPattern;

/**
 * Receiver class that performs action
 */
public class Document {
    public boolean open(){
        System.out.println("Document Opened");
        return true;
    }
    public boolean save(){
        System.out.println("Document Saved");
        return true;
    }
}
