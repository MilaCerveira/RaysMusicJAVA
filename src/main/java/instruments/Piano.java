package instruments;

public class Piano extends Instrument {
    private int keys;

    public Piano(double buyingPrice, double sellingPrice, String material, int keys) {
        super(buyingPrice, material, sellingPrice, InstrumentType.KEYBOARD);
        this.keys = keys;


    }


    @Override
    public String play() {
        return "dun dun dun";
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }
}
