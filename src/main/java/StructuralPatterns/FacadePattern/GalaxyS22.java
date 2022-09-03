package StructuralPatterns.FacadePattern;

/**
 * Samsung's implementation of Mobile Phone Model Interface
 */
public class GalaxyS22 implements MobilePhoneModel{
    @Override
    public String brand() {
        return "Samsung";
    }

    @Override
    public String modelNo() {
        return "Galaxy S22";
    }

    @Override
    public float price() {
        return 759.99f;
    }

    @Override
    public Integer memoryStorage() {
        return 128;
    }
}
