package CreationalPatterns.FactoryMethod;

public class InstitutionalPlan extends Plan {
    @Override
    public double getRate() {
        rate = 5.50;
        return rate;
    }
}
