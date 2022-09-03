package CreationalPatterns.SingletonDesignPattern;

/**
 * Class for illustrating a typical race condition where we calculate the sum,
 * and multiple threads execute calculate() method:
 */
public class BaeldungNonSynchronizedMethods {
    private int sum = 0;

    public void calculate() {
        setSum(getSum() + 1);
    }

    //Standard setters and getters

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
