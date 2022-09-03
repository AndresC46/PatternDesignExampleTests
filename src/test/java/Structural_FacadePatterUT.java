import StructuralPatterns.DecoratorPattern.Food;
import StructuralPatterns.DecoratorPattern.FoodPlatterFactory;
import StructuralPatterns.FacadePattern.MobilePhoneModel;
import StructuralPatterns.FacadePattern.PhoneDetails;
import StructuralPatterns.FacadePattern.PhoneFactory;
import StructuralPatterns.FacadePattern.ShopKeeper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Structural_FacadePatterUT {
    private static int choice;
    private Map<Integer, String> phoneMap = new HashMap<Integer, String>();

    public Structural_FacadePatterUT() {
        phoneMap.put(1, "IPHONE");
        phoneMap.put(2, "SAMSUNG");
        phoneMap.put(3, "MOTOROLA");
    }

    @Test
    public void givenMenuChoices_whenIphoneChoiceEntered_thenDisplayModelAndPrice(){
        choice = 1;
        PhoneFactory phoneFactory = new PhoneFactory();
        PhoneDetails phoneDetails = null;

        try {
            displayPhoneMenu();
            phoneDetails = phoneFactory.getPhone(phoneMap.get(choice));
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert phoneDetails != null;
        assertEquals("Iphone 13", phoneDetails.getPhoneModel());
        assertEquals(799.99f, phoneDetails.getPhonePrice());

    } // end test

    /**
     * Display Available Phone Choices
     */
    private void displayPhoneMenu() {
        // Display Phone Menu Choices
        System.out.print("========= Food Menu ============  \n");
        System.out.print("            1. IPHONE 13          \n");
        System.out.print("            2. SAMSUNG GALAXY     \n");
        System.out.print("            3. MOTOROLA           \n");
        System.out.print("            4. Exit               \n");
        System.out.print("Enter your choice: ");
    }


} // end class
