package CreationalPatterns.BuilderDesignPattern.CD;

public class VideoCD extends MediaType {
    @Override
    public String contents() {
        return "Video";
    }

    @Override
    public String pack() {
        return "Video";
    }

    @Override
    public double price() {
        return 10.00;
    }
}
