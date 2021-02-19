package instruments;

public class Drums extends Instrument {
    public Drums(double price, String material) {
        super(price, material);
    }

    @Override
    public String play() {
        return "Bootz catz bootz cats";
    }
}
