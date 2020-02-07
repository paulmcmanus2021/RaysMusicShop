package instruments;

public class Drumkit extends Instrument {

    private int numberOfDrums;

    public Drumkit(String material, String colour, String sound, Double buyPrice, Double sellPrice, InstrumentType type, int numberOfDrums) {
        super(material, colour, sound, buyPrice, sellPrice, type);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }
}
