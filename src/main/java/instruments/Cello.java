package instruments;

public class Cello extends Instrument {
    private int strings;

    public Cello(double buyingPrice, String material, double sellingPrice, int strings) {
        super(buyingPrice, material, sellingPrice, InstrumentType.STRING);
        this.strings = strings;
    }

    @Override
    public String play() {
        return "Yeet Yeet";
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }


}
