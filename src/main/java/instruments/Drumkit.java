package instruments;

public class Drumkit extends Instrument {

    private int numberOfDrums;

    public Drumkit(String material, String colour, String sound, double buyPrice, double sellPrice, double profit, InstrumentType type, int numberOfDrums) {
        super(material, colour, sound, buyPrice, sellPrice, profit, type);
        this.numberOfDrums = numberOfDrums;

    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public double calculateMarkup() {
        return this.getSellPrice() - this.getBuyPrice();
    }

    @Override
    public String playInstrument() {
        return "Badum-tsh";
    }
}
