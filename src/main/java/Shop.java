import accessories.Accessory;
import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Instrument> instruments;
    private ArrayList<Accessory> accessories;

    public Shop() {
        instruments = new ArrayList<Instrument>();
        accessories = new ArrayList<Accessory>();
    }

    public void addInstrument(Instrument instrument){this.instruments.add(instrument);}

    public void removeInstrument(Instrument instrument){this.instruments.remove(instrument);}


    public void addAccessory(Accessory accessory){this.accessories.add(accessory);}

    public void removeAccessory(Accessory accessory){this.accessories.remove(accessory);}

    public int getInstrumentCount(){ return this.instruments.size();}

    public int getAccessoryCount(){ return this.accessories.size();}

    public ArrayList<ISell> getStock() {
        ArrayList<ISell> stock = new ArrayList<>();
        stock.addAll(this.instruments);
        stock.addAll(this.accessories);
        return stock;
    }

    public double calculateTotalProfit(){
        double totalProfit = 0;
        ArrayList<ISell> stock = getStock();
        for(ISell item : stock){
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }
}

