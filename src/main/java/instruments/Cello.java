package instruments;

public class Cello extends Instrument {
    public Cello(double price, String material) {
        super(price, material);
    }

    @Override
    public String play() {
        return "Yeet Yeet";
    }
}
