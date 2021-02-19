package instruments;

public class Violin extends Instrument{
    public Violin(double price, String material) {
        super(price, material);
    }

    @Override
    public String play() {
        return "Screech screech";
    }
}
