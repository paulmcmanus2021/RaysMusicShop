import accessories.*;
import behaviours.ISell;
import instruments.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    private ArrayList<ISell> stock;

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


    @Before
    public void before() {
        shop = new Shop();
        stock = new ArrayList<ISell>();

        guitar = new Guitar("Nylon", "Red", "Twang", 50.00, 75.00, 25.00, InstrumentType.STRINGS, 6);
        drumkit = new Drumkit("Wood", "Black", "Badum-tsh", 130.00, 199.99, 69.99, InstrumentType.PERCUSSION, 4);
        oboe = new Oboe("Resin", "Black", "Laaaaaa", 100.00, 189.99, 89.99, InstrumentType.WOODWIND, "Wiener");
        trumpet = new Trumpet("Brass", "Blue", "Brrrrppt", 48.00, 96.00, 48.00, InstrumentType.BRASS, 3);
        instruments = new ArrayList<Instrument>();

        drumSticks = new DrumSticks("Use these to play drums.", 8.00, 14.99);
        musicStand = new MusicStand("Use this to hold your sheet music.", 18.99, 30.00);
        plectrum = new Plectrum("Use this to play guitar.", 0.15, 0.75);
        sheetMusic = new SheetMusic("Use this to know what note comes next.", 5.00, 9.99);
        accessories = new ArrayList<Accessory>();
    }

    //Add and Remove Instruments
    @Test
    public void canAddToInstrumentArray() {
        shop.addInstrument(guitar);
        shop.addInstrument(drumkit);
        shop.addInstrument(oboe);
        shop.addInstrument(trumpet);
        assertEquals(4, shop.getInstrumentCount());
    }

    @Test
    public void canRemoveFromInstrumentArray() {
        shop.addInstrument(guitar);
        shop.addInstrument(drumkit);
        shop.addInstrument(oboe);
        shop.addInstrument(trumpet);
        shop.removeInstrument(trumpet);
        assertEquals(3, shop.getInstrumentCount());
    }

    //Add and remove Accesories
    @Test
    public void canAddToAccessoryArray() {
        shop.addAccessory(drumSticks);
        shop.addAccessory(musicStand);
        shop.addAccessory(plectrum);
        shop.addAccessory(sheetMusic);
        assertEquals(4, shop.getAccessoryCount());
    }

    @Test
    public void canRemoveFromAccessoryArray() {
        shop.addAccessory(drumSticks);
        shop.addAccessory(musicStand);
        shop.addAccessory(plectrum);
        shop.addAccessory(sheetMusic);
        shop.removeAccessory((sheetMusic));
        assertEquals(3, shop.getAccessoryCount());
    }

    //Add ArrayList<Instrument> and ArrayList<Accessory> to ArrayList<ISell>
    @Test
    public void canGetAllStock() {
        shop.addInstrument(guitar);
        shop.addInstrument(drumkit);
        shop.addInstrument(oboe);
        shop.addInstrument(trumpet);
        shop.addAccessory(drumSticks);
        shop.addAccessory(musicStand);
        shop.addAccessory(plectrum);
        shop.addAccessory(sheetMusic);
        ArrayList<ISell> result = shop.getStock();
        assertEquals(8, result.size());
    }

    @Test
    public void canGetTotalPotentialProfit() {
        shop.addInstrument(guitar);
        shop.addInstrument(drumkit);
        shop.addInstrument(oboe);
        shop.addInstrument(trumpet);
        shop.addAccessory(drumSticks);
        shop.addAccessory(musicStand);
        shop.addAccessory(plectrum);
        shop.addAccessory(sheetMusic);
        double result = shop.calculateTotalProfit();
        assertEquals(256.57, result, 0.01);
    }
}
