package StructuralPatterns.FacadePattern;

import StructuralPatterns.DecoratorPattern.*;

public class PhoneFactory {
    ShopKeeper shopKeeper = new ShopKeeper();

    public PhoneDetails getPhone(String phoneModel){
        if(phoneModel == null){
            return null;
        }

        if(phoneModel.equalsIgnoreCase("IPHONE")){
            return shopKeeper.iphoneSale();
        } else if(phoneModel.equalsIgnoreCase("SAMSUNG")){
            return shopKeeper.samsungSale();
        } else if(phoneModel.equalsIgnoreCase("MOTOROLA")) {
            return shopKeeper.motorolaSale();
        } else {
            System.out.println("Invalid Phone name supplied.");
            return null;
        }
    } // end method

} // endclass
