package CreationalPatterns.BuilderDesignPattern.Menu;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Soda());
        return meal;
    }

    public Meal prepareChickenMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Soda());
        meal.addItem(new FrenchFries());
        return meal;
    }

    public Meal royalFeastMeal (){
        Meal meal = new Meal();
        meal.addItem(new RoyalBeefBurger());
        meal.addItem(new MilkShake());
        meal.addItem(new OnionRings());
        return meal;
    }

}
