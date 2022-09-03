package CreationalPatterns.BuilderDesignPattern.Menu;

public abstract class SideItem implements MenuItem {
    @Override
    public MenuPacking packing() {
        return new PaperSleeve();
    }

    @Override
    public abstract float price();
}
