package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String material, String colour, String sound, double buyPrice, double sellPrice, double profit, InstrumentType type, int numberOfStrings) {
        super(material, colour, sound, buyPrice, sellPrice, profit, type);
        this.numberOfStrings = numberOfStrings;
    }

    //Instance method
    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    //ISell Interface method
    public double calculateMarkup() {
        return this.getSellPrice() - this.getBuyPrice();
    }

    //IPlay interface method
    public String playInstrument() {
        return "Twang";
    }
}
