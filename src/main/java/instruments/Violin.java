package instruments;

public class Violin extends Instrument{
    public Violin(double price) {
        super(price);
    }

    @Override
    public String play() {
        return "Screech screech";
    }
}
