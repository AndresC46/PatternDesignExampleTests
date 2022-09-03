package StructuralPatterns.DecoratorPattern;

/**
 * Vegetarian Food Platter implements Food
 */
public class VegetarianPlatter implements Food {
    @Override
    public String prepareFood() {
        return "Vegetarian Food Platter";
    }

    @Override
    public double foodPrice() {
        return 50.0;
    }


} // endclass
