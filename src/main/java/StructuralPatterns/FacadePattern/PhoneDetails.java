package StructuralPatterns.FacadePattern;

public class PhoneDetails {
    String phoneBrand;
    String phoneModel;
    float phonePrice;
    int phoneMemory;

    /**
     * Contructor for Phone Details
     * @param phoneBrand name
     * @param phoneModel model
     * @param phonePrice  price
     * @param phoneMemory internal phone memory in GB
     */
    public PhoneDetails(String phoneBrand, String phoneModel, float phonePrice, int phoneMemory) {
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
        this.phonePrice = phonePrice;
        this.phoneMemory = phoneMemory;
    }

    // Setters and Getters
    public String getPhoneBrand() { return phoneBrand; }
    public void setPhoneBrand(String phoneBrand){ this.phoneBrand = phoneBrand; }

    public String getPhoneModel() { return phoneModel; }
    public void setPhoneModel(String phoneModel) { this.phoneModel = phoneModel; }

    public float getPhonePrice() { return phonePrice; }
    public void setPhonePrice(float phonePrice) { this.phonePrice = phonePrice; }

    public int getPhoneMemory() { return phoneMemory; }
    public void setPhoneMemory(int phoneMemory) { this.phoneMemory = phoneMemory; }


} // end class



