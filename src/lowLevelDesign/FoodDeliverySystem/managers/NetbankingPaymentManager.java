package lowLevelDesign.FoodDeliverySystem.managers;

import lowLevelDesign.FoodDeliverySystem.data.PaymentResponse;

public class NetbankingPaymentManager implements PaymentManager{
    private final String bankName;
    private final String userName;
    private final String password;
    private final String pin;
    private final double amount;

    public NetbankingPaymentManager(String bankName, String userName, String password, String pin, double amount) {
        this.bankName = bankName;
        this.userName = userName;
        this.password = password;
        this.pin = pin;
        this.amount = amount;
    }

    @Override
    public PaymentResponse executePayment() {
        return null;
    }
}
