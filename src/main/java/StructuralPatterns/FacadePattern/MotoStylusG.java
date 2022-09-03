package StructuralPatterns.FacadePattern;

/**
 * Motorola implementation of Mobile Phone Model Interface
 */
public class MotoStylusG implements MobilePhoneModel{
    @Override
    public String brand() {
        return "Motorola";
    }

    @Override
    public String modelNo() {
        return "Moto G Stylus";
    }

    @Override
    public float price() {
        return 299.99f;
    }

    @Override
    public Integer memoryStorage() {
        return 128;
    }
}
