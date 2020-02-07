package instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String material, String colour, String sound, Double buyPrice, Double sellPrice, double profit, InstrumentType type, int numberOfValves) {
        super(material, colour, sound, buyPrice, sellPrice, profit, type);
        this.numberOfValves = numberOfValves;

    }


    public int getNumberOfValves() {
        return numberOfValves;
    }
}
