package StructuralPatterns.FacadePattern;

/**
 * Apple implementation of Mobile Phone Model Interface
 *
 */
public class Iphone13 implements MobilePhoneModel {
    @Override
    public String brand() {
        return "Apple";
    }

    @Override
    public String modelNo() {
        return "Iphone 13";
    }

    @Override
    public float price() {
        return 799.99f;
    }

    @Override
    public Integer memoryStorage() {
        return 132;
    }
}
