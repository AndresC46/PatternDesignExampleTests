package BehavioralPatterns.StrategyPattern;

/**
 *  Context class that will ask from Strategy interface to execute a type of strategy.
 */
public class StrategyContext {
    private Strategy strategy;

    public StrategyContext(Strategy strategy){
        this.strategy = strategy;
    }

    public float executeStrategy(float num1, float num2){
        return strategy.calculation(num1, num2);
    }

}  // end class
