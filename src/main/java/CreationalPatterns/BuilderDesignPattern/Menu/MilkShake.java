package CreationalPatterns.BuilderDesignPattern.Menu;

public class MilkShake extends ColdDrink{
    @Override
    public String name() {
        return "MilkShake";
    }

    @Override
    public float price() {
        return 3.75f;
    }
}
