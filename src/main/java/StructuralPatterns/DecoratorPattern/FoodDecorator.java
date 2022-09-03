package StructuralPatterns.DecoratorPattern;

/**
 *  FoodDecorator abstract class that implements the Food interface
 *  and overrides all it's methods.
 *  It has the ability to decorate foods
 */
public abstract class FoodDecorator implements Food {
    private Food newFood;

    public FoodDecorator(Food newFood)  {
        this.newFood = newFood;
    }

    @Override
    public String prepareFood() {
        return newFood.prepareFood();
    }

    @Override
    public double foodPrice() {
        return newFood.foodPrice();
    }

} // end class
