package lowLevelDesign.ParkingLotSystem.payments;

public interface PaymentProcessor {
    boolean executePayment();
    double getAmount();
}
