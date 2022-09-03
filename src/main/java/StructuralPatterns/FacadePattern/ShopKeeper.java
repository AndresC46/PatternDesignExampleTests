package StructuralPatterns.FacadePattern;

/**
 * Concrete class that will use MobilePhoneModel interface.
 */
public class ShopKeeper {
    private final MobilePhoneModel iPhone;
    private final MobilePhoneModel samsung;
    private MobilePhoneModel motorola;

    public ShopKeeper() {
        iPhone = new Iphone13();
        samsung = new GalaxyS22();
        motorola = new MotoStylusG();
    }

    public PhoneDetails iphoneSale(){
        return new PhoneDetails(
                iPhone.brand(),
                iPhone.modelNo(),
                iPhone.price(),
                iPhone.memoryStorage()
        );
    }

    public PhoneDetails samsungSale(){
        return new PhoneDetails(
                samsung.brand(),
                samsung.modelNo(),
                samsung.price(),
                samsung.memoryStorage()
        );
    }

    public PhoneDetails motorolaSale(){
        return new PhoneDetails(
                motorola.brand(),
                motorola.modelNo(),
                motorola.price(),
                motorola.memoryStorage()
        );
    }



} // end class
