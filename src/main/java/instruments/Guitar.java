package instruments;

public class Guitar extends Instrument {
    private int strings;

    public Guitar(double buyingPrice, double sellingPrice, String material, int strings) {
        super(buyingPrice, material, sellingPrice, InstrumentType.STRING);
        this.strings = strings;
    }

    @Override
    public String play() {
        return "clang alang lang lang lang clang alang lang lang";
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }
}


