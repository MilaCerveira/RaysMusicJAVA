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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
