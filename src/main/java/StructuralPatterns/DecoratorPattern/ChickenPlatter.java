package StructuralPatterns.DecoratorPattern;

/**
 * Concrete class that will extend the FoodDecorator class and override it's all methods.
 */
public class ChickenPlatter extends FoodDecorator {

    public ChickenPlatter(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return "Spicy Curry Chicken Platter";
    }
    public double foodPrice()   {
        return super.foodPrice() + 30.0;
    }

} // end class
