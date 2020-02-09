package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private String sound;
    private double buyPrice;
    private double sellPrice;
    private double profit;
    private InstrumentType type;


    public Instrument(String material, String colour, String sound, double buyPrice, double sellPrice, double profit, InstrumentType type) {
        this.material = material;
        this.colour = colour;
        this.sound = sound;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.profit = profit;
        this.type = type;
    }

    //Getters
    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getSound() {
        return sound;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getProfit() {
        return profit;
    }

    public InstrumentType getType() {
        return type;
    }

    //Setters
    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    //IPlay interface method.
    public abstract String playInstrument();
}
