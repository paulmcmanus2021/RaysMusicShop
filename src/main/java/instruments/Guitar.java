package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String material, String colour, String sound, double buyPrice, double sellPrice, double profit, InstrumentType type, int numberOfStrings) {
        super(material, colour, sound, buyPrice, sellPrice, profit, type);
        this.numberOfStrings = numberOfStrings;
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public double calculateMarkup() {
        return this.getSellPrice() - this.getBuyPrice();
    }
}
