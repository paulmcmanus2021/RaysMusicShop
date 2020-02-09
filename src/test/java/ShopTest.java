import accessories.*;
import behaviours.ISell;
import instruments.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Guitar guitar;
    Drumkit drumkit;
    Oboe oboe;
    Trumpet trumpet;
    private ArrayList<Instrument> instruments;

    Accessory drumSticks;
    Accessory musicStand;
    Accessory plectrum;
    Accessory sheetMusic;
    private ArrayList<Accessory> accessories;

    private ArrayList<ISell> stock;

    @Before
    public void before(){
        guitar = new Guitar("Nylon","Red","Twang", 50.00, 75.00, 25.00, InstrumentType.STRINGS,6);
        drumkit = new Drumkit("Wood", "Black","Badum-tsh",130.00,199.99,69.99,InstrumentType.PERCUSSION,4);
        oboe = new Oboe("Resin","Black","Laaaaaa",100.00,189.99,89.99,InstrumentType.WOODWIND,"Wiener");
        trumpet = new Trumpet("Brass", "Blue", "Brrrrppt", 48.00, 96.00, 48.00, InstrumentType.BRASS, 3);
        instruments = new ArrayList<Instrument>();

        drumSticks = new DrumSticks("Use these to play drums.", 8.00, 14.99);
        musicStand = new MusicStand("Use this to hold your sheet music.", 18.99, 30.00);
        plectrum = new Plectrum("Use this to play guitar.", 0.15, 0.75);
        sheetMusic = new SheetMusic("Use this to know what note comes next.", 5.00, 9.99);
        accessories = new ArrayList<Accessory>();

        stock = new ArrayList<ISell>();
    }

    @Test
    public void canAddInstrumentToInstrumentsArray(){
        instruments.add(guitar);
        instruments.add(drumkit);
        instruments.add(oboe);
        instruments.add(trumpet);
        assertEquals(4, instruments.size());
    }

    @Test
    public void canAddAccessoriesToAccessoriesArray(){
        accessories.add(drumSticks);
        accessories.add(musicStand);
        accessories.add(plectrum);
        accessories.add(sheetMusic);
        assertEquals(4, accessories.size());
    }

    @Test
    public void canAddISellToStock(){
        stock.add(guitar);
        stock.add(drumkit);
        stock.add(oboe);
        stock.add(trumpet);
        stock.add(drumSticks);
        stock.add(musicStand);
        stock.add(plectrum);
        stock.add(sheetMusic);
        assertEquals(8, stock.size());
    }

    @Test
    public void canAddRemoveFromArrayLists(){
        //Instruments
        instruments.add(guitar);
        instruments.add(drumkit);
        instruments.add(oboe);
        instruments.remove(drumkit);

        //Accessories
        accessories.add(drumSticks);
        accessories.add(musicStand);
        accessories.add(plectrum);
        accessories.remove(musicStand);

        //Stock
        stock.add(drumkit);
        stock.add(oboe);
        stock.add(trumpet);
        stock.add(drumSticks);
        stock.add(musicStand);
        stock.add(plectrum);
        stock.remove(trumpet);
        assertEquals(2,instruments.size());
        assertEquals(2,accessories.size());
        assertEquals(5,stock.size());
    }

}
