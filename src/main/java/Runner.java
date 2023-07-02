import Item.Guitar;
import Item.Piano;

public class Runner {
    public static void main(String[] args) {
       Piano piano1 = new Piano(100,200,"blackAndWhite");
       Guitar guitar1= new Guitar(60,100,5);

        String guitarSound = guitar1.makeSound();
        String pianoSound = piano1.makeSound();
        int change =piano1.sellItem(300);


        System.out.println(pianoSound);
        System.out.println(guitarSound);
        System.out.println(change);
        System.out.println(piano1.canSell(300));



    }
}
