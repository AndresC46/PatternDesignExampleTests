package CreationalPatterns.SingletonDesignPattern;

public class BaeldungSynchronizedMethods {
    private static int sum = 0;
    //create an object of SingleObject
    private static BaeldungSynchronizedMethods instance;

    //make the constructor private so that this class cannot be instantiated
    private BaeldungSynchronizedMethods(){}

    //Get the only object available
    public static synchronized BaeldungSynchronizedMethods getInstance(){
        if(instance == null){
            instance = new BaeldungSynchronizedMethods();
        }
        return instance;
    }

    public synchronized void calculate() {
        setSum(getSum() + 1);
    }

    //Standard setters and getters
    public static synchronized int getSum() {
        return sum;
    }
    public synchronized void setSum(int sum) {this.sum = sum;}



}
