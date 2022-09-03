import StructuralPatterns.DecoratorPattern.*;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Will test the ability of a DecoratorPatternCustomer class that will
 * use Food interface to determine which type of food customer wants. (Decorates).
 */
public class Structural_DecoratorPatternUT {
    private static int choice;
    private static String platterName;
    private static double platterPrice;
    private Map<Integer, String> foodMap = new HashMap<Integer, String>();

    public Structural_DecoratorPatternUT() {
        foodMap.put(1, "VEGETARIAN");
        foodMap.put(2, "CHICKEN");
        foodMap.put(3, "CHINESE");
        foodMap.put(4, "SEAFOOD");
    }

    @Test
    public void givenMenuChoices_whenVegetarianChoiceEntered_thenDisplayFoodAndPrice(){
        choice = 1;
        platterPrice = 0;
        try {
            displayFoodMenu();
            FoodPlatterFactory foodPlatterFactory = new FoodPlatterFactory();
            Food foodPlatter = foodPlatterFactory.getPlatter(foodMap.get(choice));
            platterPrice = foodPlatter.foodPrice();
            platterName = foodPlatter.prepareFood();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(50.0, platterPrice);
        assertEquals("Vegetarian Food Platter", platterName);
    }

    @Test
    public void givenMenuChoices_whenChickenChoiceEntered_thenDisplayFoodAndPrice(){
        choice = 2;
        platterPrice = 0;
        try {
            displayFoodMenu();
            FoodPlatterFactory foodPlatterFactory = new FoodPlatterFactory();
            Food foodPlatter = foodPlatterFactory.getPlatter(foodMap.get(choice));
            platterPrice = foodPlatter.foodPrice();
            platterName = foodPlatter.prepareFood();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(80.0, platterPrice);
        assertEquals("Spicy Curry Chicken Platter", platterName);
    }


    /**
     * Display Menu and Return Choice
     * @throws IOException if non-numeric is supplied
     */
    private void displayFoodMenu() throws IOException {
        // Display Menu Choices
        System.out.print("========= Food Menu ============    \n");
        System.out.print("            1. Vegetarian Platter.  \n");
        System.out.print("            2. Chicken Platter.     \n");
        System.out.print("            3. Chinese Platter.     \n");
        System.out.print("            4. Seafood Platter.     \n");
        System.out.print("            5. Exit                 \n");
        System.out.print("Enter your choice: ");

    }


}
