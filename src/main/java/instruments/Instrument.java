package instruments;

public abstract class Instrument {

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

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getProfit() {
        return profit;
    }

    public InstrumentType getType() {
        return type;
    }
}
