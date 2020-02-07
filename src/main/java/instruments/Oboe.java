package instruments;

public class Oboe extends Instrument {

    private String oboeStyle;

    public Oboe(String material, String colour, String sound, Double buyPrice, Double sellPrice, InstrumentType type, String oboeStyle) {
        super(material, colour, sound, buyPrice, sellPrice, type);
        this.oboeStyle = oboeStyle;
    }

    public String getOboeStyle() {
        return oboeStyle;
    }
}