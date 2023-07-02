import Item.Guitar;
import Item.ISell;
import Item.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop1;
    Piano piano1;
    Piano piano2;
    Guitar guitar1;

    @Before
    public void before(){
        piano1=new Piano(60,200,"Pink");
        piano2=new Piano(80,100,"Yellow");
        guitar1 =new Guitar(40,90,4);
        shop1 = new Shop("Music Land");
        shop1.addItems(piano1);
        shop1.addItems(piano2);
        shop1.addItems(guitar1);

    }

    @Test
    public void canAddStock(){
        assertEquals(3, shop1.getStockCount());
    }


    @Test
    public void removeItems(){
        shop1.removeItems(piano1);
        assertEquals(2, shop1.getStockCount());
    }


    @Test
    public void canGetTotalProfit(){
        int total=shop1.getProfit();
        assertEquals(210,shop1.getProfit());
    }


}
