package instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String material, String colour, String sound, Double buyPrice, Double sellPrice, InstrumentType type, int numberOfValves) {
        super(material, colour, sound, buyPrice, sellPrice, type);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
