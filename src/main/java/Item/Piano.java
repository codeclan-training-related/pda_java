package Item;

public class Piano extends Instrument implements IPlay, ISell {

    private String keyboard;

    public Piano(int priceIn, int priceOut, String keyboard) {
        super(priceIn, priceOut);
        this.keyboard = keyboard;
    }

    public String getKeyboard() {
        return keyboard;
    }


    @Override
    public String makeSound() {
        return "dingdingdingding";
    }




}
