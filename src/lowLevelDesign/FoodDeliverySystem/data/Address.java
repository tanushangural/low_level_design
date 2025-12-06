package lowLevelDesign.FoodDeliverySystem.data;

public class Address {
    private final String addressLine1;
    private final String addressLine2;
    private final String city;
    private final String state;
    private final String country;
    private final String zip;

    public Address(String addressLine1, String addressLine2, String city, String state, String country, String zip) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }
}
