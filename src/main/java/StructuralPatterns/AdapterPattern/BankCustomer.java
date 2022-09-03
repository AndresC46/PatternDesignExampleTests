package StructuralPatterns.AdapterPattern;

/**
 * Adapter Class
 */
public class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void giveBankDetails() {
        String customername = "Fefita LaGrande";
        long accno = 1234567890;
        String bankname = "Santander";

        // Set Bank Details
        setAccHolderName(customername);
        setAccNumber(accno);
        setBankName(bankname);
    }

    @Override
    public String getCreditCard() {
        long accno=getAccNumber();
        String accholdername=getAccHolderName();
        String bname=getBankName();

        return ("The Account number "+accno+" of "+accholdername+" in "+bname
                + " bank is valid and authenticated for issuing the credit card. ");
    }
}
