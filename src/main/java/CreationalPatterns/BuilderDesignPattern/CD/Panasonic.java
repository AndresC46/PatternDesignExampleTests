package CreationalPatterns.BuilderDesignPattern.CD;

public class Panasonic extends Company {
    @Override
    public String pack() {
        return "PANASONIC CD";
    }

    @Override
    public double price() {
        return 1.25;
    }
}
