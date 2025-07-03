package ParkingLotSystem.factory;

import ParkingLotSystem.data.CardDetails;
import ParkingLotSystem.payments.CardPaymentProcessor;
import ParkingLotSystem.payments.CashPaymentProcessor;
import ParkingLotSystem.payments.PaymentProcessor;

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
