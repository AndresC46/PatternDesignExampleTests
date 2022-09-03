import CreationalPatterns.AbstractFactoryPattern.AbstractFactory;
import CreationalPatterns.AbstractFactoryPattern.Bank.Bank;
import CreationalPatterns.AbstractFactoryPattern.FactoryCreator;
import CreationalPatterns.AbstractFactoryPattern.Loan.Loan;
import org.junit.jupiter.api.Test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Creational_AbstractFactorySampleUT {
    boolean debug = false;
    Logger logger = LoggerFactory.getLogger("TDD_EventLogger");


    @Test
    public void abstractFactoryPatternExample()  {
        String bankName = "SBI";
        String loanName = "Home";
        double rate = 3.5;
        double loanAmount = 12500;
        int years = 3;

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        assert bankFactory != null;
        Bank b = bankFactory.getBank(bankName);

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        assert loanFactory != null;
        Loan l = loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        double monthlyPayment = l.calculateLoanPayment(loanAmount, years);

        System.out.println("You are taking the loan from "+ b.getBankName().toString());
        System.out.println(String.format("Rate is %s, loan time is %s",  rate, years));
        System.out.println("your monthly EMI is "+ monthlyPayment +" for the amount "+loanAmount+" you have borrowed");
    }

}
