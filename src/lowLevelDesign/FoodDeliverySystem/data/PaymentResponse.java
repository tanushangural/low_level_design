package lowLevelDesign.FoodDeliverySystem.data;

import lowLevelDesign.FoodDeliverySystem.enums.PaymentStatus;

public class PaymentResponse {
    private final double amount;
    private final int paymentId;
    private final PaymentStatus paymentStatus;

    public PaymentResponse(double amount, int paymentId, PaymentStatus paymentStatus) {
        this.amount = amount;
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
}
