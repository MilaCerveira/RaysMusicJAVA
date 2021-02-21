package shopItems;

import interfaces.ISell;

public class ShopItem implements ISell {
    private double buyingPrice;
    private double sellingPrice;
    private String description;

    public ShopItem(double buyingPrice, double sellingPrice, String description) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.description = description;
    }

    @Override
    public double calculateMarkUp() {

        return sellingPrice - buyingPrice;
    }
}
