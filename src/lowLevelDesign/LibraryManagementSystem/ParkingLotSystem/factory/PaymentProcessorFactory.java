package lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.factory;

import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.CardDetails;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.payments.CardPaymentProcessor;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.payments.CashPaymentProcessor;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.payments.PaymentProcessor;

public class PaymentProcessorFactory {
    private PaymentProcessorFactory() {
        // Private constructor to prevent instantiation
    }

    public static PaymentProcessor getCardBasedPaymentProcessor(double amount,
                                                                CardDetails cardDetails) {
        return new CardPaymentProcessor(amount, cardDetails);
    }

    public static PaymentProcessor getCashBasedPaymentProcessor(double amount) {
        return new CashPaymentProcessor(amount);
    }
}
