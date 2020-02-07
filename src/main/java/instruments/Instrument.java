package instruments;

public abstract class Instrument {

    private String material;
    private String colour;
    private String sound;
    private Double buyPrice;
    private Double sellPrice;
    private InstrumentType type;

    public Instrument(String material, String colour, String sound, Double buyPrice, Double sellPrice, InstrumentType type) {
        this.material = material;
        this.colour = colour;
        this.sound = sound;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public InstrumentType getType() {
        return type;
    }
}
