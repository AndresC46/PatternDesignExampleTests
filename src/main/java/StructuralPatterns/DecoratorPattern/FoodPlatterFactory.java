package StructuralPatterns.DecoratorPattern;

/**
 * Return Platter based on food type provided
 */
public class FoodPlatterFactory {

    public Food getPlatter(String foodPlatter){
        if(foodPlatter == null){
            return null;
        }

        if(foodPlatter.equalsIgnoreCase("VEGETARIAN")){
            return new VegetarianPlatter();
        } else if(foodPlatter.equalsIgnoreCase("CHICKEN")){
            return new ChickenPlatter((Food) new VegetarianPlatter());
        } else if(foodPlatter.equalsIgnoreCase("CHINESE")) {
            return new ChineseDelightPlatter((Food) new VegetarianPlatter());
        } else if(foodPlatter.equalsIgnoreCase("SEAFOOD")) {
            return new SeafoodPlatter((Food) new VegetarianPlatter());
        } else {
            System.out.println("Invalid Platter name supplied.");
            return null;
        }


    } // end method


//    VEGETARIAN,
//    CHICKEN,
//    CHINESE,
//    SEAFOOD


} // end class
