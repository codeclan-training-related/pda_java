package Item;

public class Guitar extends Instrument implements IPlay,ISell {
    private int strings;

    public Guitar(int priceIn, int priceOut, int strings){
        super(priceIn,priceOut);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    @Override
    public String makeSound() {
        return "tatatatatat";
    }
}
