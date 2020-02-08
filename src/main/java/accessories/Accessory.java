package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private String description;
    private double buyPrice;
    private double sellPrice;

    public Accessory(String description, double buyPrice, double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
