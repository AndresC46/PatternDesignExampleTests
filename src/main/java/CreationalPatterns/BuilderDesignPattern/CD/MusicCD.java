package CreationalPatterns.BuilderDesignPattern.CD;

public class MusicCD extends MediaType {
    @Override
    public String contents() {
        return "Music";
    }

    @Override
    public String pack() {
        return "Music";
    }

    @Override
    public double price() {
        return 7.50;
    }
}
