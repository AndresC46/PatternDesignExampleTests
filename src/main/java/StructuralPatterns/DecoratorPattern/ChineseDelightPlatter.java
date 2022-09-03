package StructuralPatterns.DecoratorPattern;

/**
 * Concrete class that will extend the FoodDecorator class and override it's all methods.
 */
public class ChineseDelightPlatter extends FoodDecorator {

    public ChineseDelightPlatter(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return "Szechuan Beef With Fried Rice and Manchurian Vegetables";
    }
    public double foodPrice()   {
        return super.foodPrice() + 15.0;
    }


}  // end class
