package CreationalPatterns.BuilderDesignPattern.CD;

public abstract class CD implements Packing {
    public abstract String pack();

    @Override
    public double price() {
        return 0;
    }
}
