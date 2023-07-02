import Item.ISell;
import Item.Instrument;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name =name;
        this.stock = new ArrayList<>();
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }


    public void addItems(ISell itemName){
        getStock().add(itemName);
    }

    public void removeItems(ISell itemName){
        getStock().remove(itemName);
    }


    public int getStockCount() {
        return getStock().size();

    }


    public int getProfit() {
        int total = 0;
        for (ISell item : stock) {
            int balance = item.getPriceOut() - item.getPriceIn();
            total += balance;
        }
        return total;
    }


}
