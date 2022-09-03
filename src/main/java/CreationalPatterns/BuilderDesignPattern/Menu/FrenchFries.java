package CreationalPatterns.BuilderDesignPattern.Menu;

public class FrenchFries extends SideItem{
    @Override
    public String name() {
        return "French Fries";
    }

    @Override
    public float price() {
        return 1.95f;
    }
}
