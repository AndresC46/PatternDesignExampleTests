package StructuralPatterns.DecoratorPattern;

/**
 * Concrete class that will extend the FoodDecorator class and override it's all methods.
 */
public class SeafoodPlatter extends FoodDecorator{
    public SeafoodPlatter(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return "Seafood Platter";
    }

    public double foodPrice()   {
        return super.foodPrice() + 50.0;
    }

} // end class


