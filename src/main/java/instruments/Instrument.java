package instruments;

import interfaces.IPlay;

public abstract class Instrument implements IPlay {
    private double price;

    public Instrument(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
