package CreationalPatterns.BuilderDesignPattern.Menu;

public class RoyalBeefBurger extends Burger{
    @Override
    public String name() {
        return "Royal Beef Burger";
    }

    @Override
    public float price() {
        return 7.75F;
    }
}
