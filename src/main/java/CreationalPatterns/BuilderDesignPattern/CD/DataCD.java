package CreationalPatterns.BuilderDesignPattern.CD;

public class DataCD extends MediaType {

    @Override
    public String contents() {
        return "Data";
    }

    @Override
    public String pack() {
        return "Data";
    }

    @Override
    public double price() {
        return 5.00;
    }
}
