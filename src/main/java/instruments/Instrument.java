package instruments;

import interfaces.IPlay;

public abstract class Instrument implements IPlay {
    private double price;
    private String material;


    public Instrument(double price, String material){
        this.price = price;
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
