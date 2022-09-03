package CreationalPatterns.FactoryMethod;

public class CommercialPlan extends Plan {
    @Override
    public double getRate() {
        rate = 7.50;
        return rate;
    }
}
