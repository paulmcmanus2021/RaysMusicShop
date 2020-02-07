import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Guitar guitar;
    Drumkit drumkit;
    Oboe oboe;
    Trumpet trumpet;

    @Before
    public void before(){
        guitar = new Guitar("Nylon","Red","Twang", 50.00, 75.00, 25.00, InstrumentType.STRINGS,6);
        drumkit = new Drumkit("Wood", "Black","Badum-tsh",130.00,199.99,69.99,InstrumentType.PERCUSSION,4);
        oboe = new Oboe("Resin","Black","Laaaaaa",100.00,189.99,89.99,InstrumentType.WOODWIND,"Wiener");
        trumpet = new Trumpet("Brass", "Blue", "Brrrrppt", 48.00, 96.00, 48.00, InstrumentType.BRASS, 3);
    }

    //SuperTests
    @Test
    public void canGetMaterial(){
        assertEquals("Nylon",guitar.getMaterial());
    };

    @Test
    public void canGetColour(){
        assertEquals("Blue", trumpet.getColour());
    };

    @Test
    public void canGetSound(){
        assertEquals("Laaaaaa", oboe.getSound());
    };

    @Test
    public void canGetBuyPrice(){
        assertEquals(130.00, drumkit.getBuyPrice(), 0.01);
    };

    @Test
    public void canGetSellPrice(){
        assertEquals(75.00, guitar.getSellPrice(),0.01);
    };

    @Test
    public void canGetProfit(){
        assertEquals(48.00, trumpet.getProfit(),0.01);
    };

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    };

    //InstanceVariable Tests
    @Test
    public void canGetNumberOfGuitarStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetNumberOfDrums(){
        assertEquals(4, drumkit.getNumberOfDrums());
    }

    @Test
    public void canGetOboeStyle(){
        assertEquals("Wiener", oboe.getOboeStyle());
    }

    @Test
    public void canGetNumberOfValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canUseIplayToReturnSound(){
        assertEquals("Badum-tsh", drumkit.getSound());
    }
}
