package lowLevelDesign.FoodDeliverySystem.managers;

import lowLevelDesign.FoodDeliverySystem.data.PaymentResponse;

public class CardPaymentManager implements PaymentManager{
    private final String bankName;
    private final String userName;
    private final String cardNumber;
    private final String pin;
    private final double amount;

    public CardPaymentManager(String bankName, String userName, String cardNumber, String pin, double amount) {
        this.bankName = bankName;
        this.userName = userName;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.amount = amount;
    }

    @Override
    public PaymentResponse executePayment() {
        return null;
    }
}
