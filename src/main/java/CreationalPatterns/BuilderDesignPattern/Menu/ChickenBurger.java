package CreationalPatterns.BuilderDesignPattern.Menu;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 7.50F;
    }
}
