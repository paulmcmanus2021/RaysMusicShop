import accessories.*;
import instruments.Drumkit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory drumSticks;
    Accessory musicStand;
    Accessory plectrum;
    Accessory sheetMusic;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Use these to play drums.", 8.00, 14.99);
        musicStand = new MusicStand("Use this to hold your sheet music.", 18.99, 30.00);
        plectrum = new Plectrum("Use this to play guitar.", 0.15, 0.75);
        sheetMusic = new SheetMusic("Use this to know what note comes next.", 5.00, 9.99);
    }

    //SuperTests
    @Test
    public void canGetDescription(){
        assertEquals("Use these to play drums.", drumSticks.getDescription());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(18.99, musicStand.getBuyPrice(),0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(0.75, plectrum.getSellPrice(),0.01);
    }

    //ISell Interface
    @Test
    public void canGetProfit(){
        double result = musicStand.calculateMarkup();
        assertEquals(11.01, result,0.01);
    }



}
