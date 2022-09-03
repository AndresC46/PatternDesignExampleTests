package CreationalPatterns.BuilderDesignPattern.Menu;

public class Soda extends ColdDrink{
    @Override
    public String name() {
        return "Soda";
    }

    @Override
    public float price() {
        return 2.50f;
    }
}
