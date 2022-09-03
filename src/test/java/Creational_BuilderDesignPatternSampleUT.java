import CreationalPatterns.BuilderDesignPattern.CD.CDBuilder;
import CreationalPatterns.BuilderDesignPattern.CD.CDType;
import CreationalPatterns.BuilderDesignPattern.Menu.Meal;
import CreationalPatterns.BuilderDesignPattern.Menu.MealBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test suite demos Builder Design Pattern
 *  Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"
 */
public class Creational_BuilderDesignPatternSampleUT {

    @Test
    public void givenCDBuilder_whenAddCdType_thenShowItems(){
        System.out.println("");

        // Build Sony
        CDBuilder cdBuilder = new CDBuilder();
        CDType cdType1 = cdBuilder.buildSonyCD();
        cdType1.showItems();

        // Build Samsung
//        CDType cdType2 = cdBuilder.buildSamsungCD();
//        cdType2.showItems();

        // Build Panasonic
//        CDType cdType3 = cdBuilder.buildPanasonicCD();
//        cdType3.showItems();


        System.out.println("Sony Music CD");
        assertEquals(9.25, cdType1.getPrice());

    }

    @Test
    public void givenMealOrder_whenChooseRoyalFeast_ThenListPriceDisplayed(){
        MealBuilder mealBuilder = new MealBuilder();

        Meal royalFeast = mealBuilder.royalFeastMeal();
        System.out.println("Royal Feast Meal");
        royalFeast.showItems();
        System.out.println("Royal Feast Meal Cost: "+ royalFeast.getCost());
        assertEquals(13.65f, royalFeast.getCost());

    }

}
