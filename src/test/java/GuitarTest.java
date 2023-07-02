import Item.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;

    @Before
    public void before() {
        guitar1 = new Guitar(60, 100, 5);
    }

    @Test
    public void hasPriceIn() {
        assertEquals(60, guitar1.getPriceIn());
    }

    @Test
    public void hasPriceOut() {
        assertEquals(100, guitar1.getPriceOut());
    }

    @Test
    public void hasStrings() {
        assertEquals(5, guitar1.getStrings());
    }

    @Test
    public void canMakeSound() {
        assertEquals("tatatatatat", guitar1.makeSound());
    }

    @Test
    public void canBeSold() {
        String message = guitar1.canSell(10);
        int change = guitar1.sellItem(10);
        assertEquals( "not enough money", message);
        assertEquals(0, change);
    }


}
