import accessories.Accessory;
import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Instrument> instruments;
    private ArrayList<Accessory> accessories;
    private ArrayList<ISell> stock;

    public Shop() {
        instruments = new ArrayList<Instrument>();
        accessories = new ArrayList<Accessory>();
        stock = new ArrayList<ISell>();
    }

    public void addInstrumentToStock(Instrument instrument){
        stock.add(instrument);
    }

    public void addAccessoryToStock(Accessory accessory){
        stock.add(accessory);
    }

    


}

