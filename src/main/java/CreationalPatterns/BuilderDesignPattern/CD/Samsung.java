package CreationalPatterns.BuilderDesignPattern.CD;

public class Samsung extends Company{
    @Override
    public String pack() {
        return "Samsung CD";
    }

    @Override
    public double price() {
        return 1.50;
    }
}
