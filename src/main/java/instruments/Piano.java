package instruments;

public class Piano extends Instrument{
    public Piano(double price, String material) {
        super(price, material);
    }

    @Override
    public String play() {
        return "dun dun dun";
    }
}
