package CreationalPatterns.FactoryMethod;

/**
 * A Real World Example of Factory Method
 */
 public abstract class Plan {
    protected double rate;
    public abstract double getRate();

    public double calculateBill(int units){
        return units * rate;
    }
}
