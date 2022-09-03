package CreationalPatterns.AbstractFactoryPattern.Bank;

/**
 * Create concrete classes that implement the Bank interface.
 */
public class HDFC implements Bank {
    private final String BNAME;
    public HDFC(){
        BNAME="HDFC BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
