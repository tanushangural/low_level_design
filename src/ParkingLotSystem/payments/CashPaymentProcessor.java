package ParkingLotSystem.payments;

public class CashPaymentProcessor implements PaymentProcessor {
    private final double amount;
    public CashPaymentProcessor(double amount) {
        this.amount = amount;
    }
    @Override
    public boolean executePayment() {
        // Logic for processing cash payment
        System.out.println("Processing cash payment...");
        return true; // Assuming payment is successful
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
