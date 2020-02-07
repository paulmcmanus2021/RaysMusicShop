package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String material, String colour, String sound, Double buyPrice, Double sellPrice, InstrumentType type, int numberOfStrings) {
        super(material, colour, sound, buyPrice, sellPrice, type);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
