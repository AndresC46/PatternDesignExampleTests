package CreationalPatterns.BuilderDesignPattern.Menu;

public class OnionRings extends SideItem{
    @Override
    public String name() {
        return "Onion Rings";
    }

    @Override
    public float price() {
        return 2.15f;
    }
}
