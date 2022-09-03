package CreationalPatterns.BuilderDesignPattern.Menu;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veggie Burger";
    }

    @Override
    public float price() {
        return 6.75F;
    }
}
