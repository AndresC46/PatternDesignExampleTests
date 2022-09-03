package CreationalPatterns.AbstractFactoryPattern.Loan;

public class HomeLoan extends Loan{
    public void getInterestRate(double rate){
        this.rate = rate;
    }
}
