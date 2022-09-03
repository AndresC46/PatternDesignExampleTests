package CreationalPatterns.BuilderDesignPattern.Menu;

public abstract class ColdDrink implements MenuItem{

    @Override
    public MenuPacking packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
