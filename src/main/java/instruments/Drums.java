package instruments;

public class Drums extends Instrument {
    public Drums(double price) {
        super(price);
    }

    @Override
    public String play() {
        return "Bootz catz bootz cats";
    }
}
