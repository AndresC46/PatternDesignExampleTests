package CreationalPatterns.FactoryMethod;

public class DomesticPlan extends Plan {
    //@override
    public double getRate(){
        rate = 3.50;
        return rate;
    }
}
