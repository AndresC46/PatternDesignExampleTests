package CreationalPatterns.AbstractFactoryPattern.Bank;

import CreationalPatterns.AbstractFactoryPattern.Loan.Loan;
import CreationalPatterns.AbstractFactoryPattern.AbstractFactory;

public class BankFactory extends AbstractFactory {
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        } else {
            return null;
        }

    }
    public Loan getLoan(String loan) {
        return null;
    }


}
