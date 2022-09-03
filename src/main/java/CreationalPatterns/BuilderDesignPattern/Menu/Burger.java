package CreationalPatterns.BuilderDesignPattern.Menu;

public abstract class Burger implements MenuItem {
    @Override
    public MenuPacking packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
