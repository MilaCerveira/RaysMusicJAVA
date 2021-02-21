package instruments;

public class Violin extends Instrument {
    private int pegs;
    private int strings;

    public Violin(double buyingPrice, double sellingPrice, String material, int pegs, int strings) {
        super( buyingPrice, material, sellingPrice, InstrumentType.STRING);
        this.pegs = pegs;
        this.strings = strings;
    }

    @Override
    public String play() {
        return "Screech screech";
    }

    public int getPegs() {
        return pegs;
    }

    public void setPegs(int pegs) {
        this.pegs = pegs;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }
}
