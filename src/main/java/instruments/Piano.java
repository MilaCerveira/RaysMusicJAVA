package instruments;

public class Piano extends Instrument{
    public Piano(double price) {
        super(price);
    }

    @Override
    public String play() {
        return "dun dun dun";
    }
}
