package CreationalPatterns.BuilderDesignPattern.CD;

public class Sony extends Company {
    @Override
    public String pack() {
        return "Sony CD";
    }

    @Override
    public double price() {
        return 1.75;
    }
}
