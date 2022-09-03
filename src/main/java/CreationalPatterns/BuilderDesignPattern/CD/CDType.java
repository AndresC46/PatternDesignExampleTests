package CreationalPatterns.BuilderDesignPattern.CD;

import java.util.ArrayList;
import java.util.List;

public class CDType {
    private List<Packing> items = new ArrayList<Packing>();

    /**
     * Add CD Pack to list
     *
     * @param packs pack item
     */
    public void addItem(Packing packs) {
        items.add(packs);
    }

    /**
     *
     */
    public void getCost() {
        for (Packing packs : items) {
            packs.price();
        }
    }

    /**
     * Display Packing item to Standard IO
     */
    public void showItems(){
        for (Packing packing : items){
            System.out.print("CD name : "+packing.pack());
            System.out.println(", Price : "+packing.price());
        }
    }

    /**
     * Return CD price
     * @return CD price
     */
    public double getPrice() {
        double totalPrice = 0;
        for (Packing packs : items) {
            totalPrice = packs.price() + totalPrice;
        }
        return totalPrice;
    }
}
