package instruments;

public class Cello extends Instrument {
    public Cello(double price) {
        super(price);
    }

    @Override
    public String play() {
        return "Yeet Yeet";
    }
}
