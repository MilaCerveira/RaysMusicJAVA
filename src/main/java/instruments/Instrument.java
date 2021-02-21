package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {
    private double buyingPrice;
    private String material;
    private double sellingPrice;
    private InstrumentType instrumentType;



    public Instrument(double buyingPrice, String material, double sellingPrice,InstrumentType instrumentType ) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.material = material;
        this.instrumentType = instrumentType;
    }


    @Override
    public double calculateMarkUp() {
        return sellingPrice - buyingPrice;
    }


    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
