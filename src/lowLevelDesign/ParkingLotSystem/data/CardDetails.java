package lowLevelDesign.ParkingLotSystem.data;

public class CardDetails {
    private final String nameOnCard;
    private final int pin;
    private final String cardNumber;
    private final String expiryDate;

    public CardDetails(String nameOnCard, int pin, String cardNumber, String expiryDate) {
        this.nameOnCard = nameOnCard;
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }
}
