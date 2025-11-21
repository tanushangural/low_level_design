package lowLevelDesign.ParkingLotSystem.payments;

import lowLevelDesign.ParkingLotSystem.data.CardDetails;

public class CardPaymentProcessor implements PaymentProcessor{
    public CardDetails getCardDetails() {
        return cardDetails;
    }

    private final double amount;
    private final CardDetails cardDetails;

    public CardPaymentProcessor(double amount, CardDetails cardDetails) {
        this.amount = amount;
        this.cardDetails = cardDetails;
    }
    @Override
    public boolean executePayment() {
        return false;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
