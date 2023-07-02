import Item.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

     Piano piano1;

     @Before
         public void before() { piano1 = new Piano(100, 200, "BlackAndWhite");};

     @Test
     public void hasPriceIn(){
          assertEquals(100,piano1.getPriceIn());
     }

     @Test
     public void hasPriceOut(){
          assertEquals(200,piano1.getPriceOut());
     }

     @Test
     public void hasKeyBoard(){
          assertEquals("BlackAndWhite", piano1.getKeyboard());
     }

     @Test
     public void canMakeSound(){

          assertEquals("dingdingdingding", piano1.makeSound());
     }

     @Test
     public void canBeSold(){
          String message=piano1.canSell(300);
          int change=piano1.sellItem(300);
          assertEquals("enjoy it",message);
          assertEquals(100,change);
     }


}
