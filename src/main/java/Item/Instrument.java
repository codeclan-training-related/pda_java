package Item;

public abstract class Instrument implements ISell {
    private int priceIn;
    private int priceOut;

   public Instrument(int priceIn, int PriceOut){
       this.priceIn=priceIn;
       this.priceOut=PriceOut;
   }

    public int getPriceIn() {
        return priceIn;
    }

    public int getPriceOut() {
        return priceOut;
    }

    public String canSell(int paymentAmount){
        int change =sellItem(paymentAmount);
        if (change>0){
            return "enjoy it";
        }
        return "not enough money";
    }

    public int sellItem(int paymentAmount) {
        if (this.getPriceOut() < paymentAmount) {
            return paymentAmount - this.getPriceOut();
        }
//        return showError();
        return 0;
    }
}
