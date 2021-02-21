package instruments;

public class Drums extends Instrument {
    public Drums(double buyingPrice, double sellingPrice, String material) {
        super(buyingPrice, material, sellingPrice, InstrumentType.PERCUSSION);
    }

    @Override
    public String play() {
        return "Bootz catz bootz cats";
    }



}
