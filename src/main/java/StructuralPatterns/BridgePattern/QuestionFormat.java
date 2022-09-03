package StructuralPatterns.BridgePattern;

/**
 * Create a QuestionFormat class that will extend the QuestionManager class
 */
public class QuestionFormat extends QuestionManager{

    /**
     *
     * @param Catalog
     */
    public QuestionFormat(String Catalog){
        super(Catalog);
    }

    /**
     * Display all questions
     */
    public void displayAll() {
        System.out.println("\n---------------------------------------------------------");
        super.displayAll();
        System.out.println("-----------------------------------------------------------");
    }
}
