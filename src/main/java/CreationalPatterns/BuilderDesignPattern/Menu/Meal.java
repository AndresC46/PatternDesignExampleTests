package CreationalPatterns.BuilderDesignPattern.Menu;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<MenuItem> items = new ArrayList<MenuItem>();

    public void addItem(MenuItem menuItem){
        items.add(menuItem);
    }

    public float getCost(){
        float cost = 0.0f;

        for (MenuItem item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        for (MenuItem item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }

}
