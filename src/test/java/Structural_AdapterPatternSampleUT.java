import StructuralPatterns.AdapterPattern.BankCustomer;
import StructuralPatterns.AdapterPattern.CreditCard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Structural_AdapterPatternSampleUT {

    @Test
    public void givenCreditCardInterface_whenUseBankDetailsAdapter_thenOutputCreditCardInfo(){
        CreditCard targetInterface=new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());

    }

}
