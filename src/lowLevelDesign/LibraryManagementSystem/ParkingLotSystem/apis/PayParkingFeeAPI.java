package lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.apis;

import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.CardDetails;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.PaymentMode;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.Ticket;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.factory.PaymentProcessorFactory;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.payments.ParkingFeeProcessor;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.payments.PaymentProcessor;

import java.util.Map;

public class PayParkingFeeAPI {
    public boolean payParkingFee(Ticket ticket,
                                 PaymentMode paymentMode,
                                 Map<String,String> paymentDetails) {
        double amount = Double.parseDouble(paymentDetails.get("AMOUNT"));
        PaymentProcessor paymentProcessor = null;
        if(paymentMode.equals(PaymentMode.CARD)) {
            CardDetails cardDetails  = null;
            paymentProcessor = PaymentProcessorFactory.getCardBasedPaymentProcessor(amount, cardDetails);
        }
        else if(paymentMode.equals(PaymentMode.CASH)) {
            paymentProcessor = PaymentProcessorFactory.getCashBasedPaymentProcessor(amount);
        }
        else {
            throw new IllegalArgumentException("Invalid payment mode: " + paymentMode);
        }

        return new ParkingFeeProcessor().processParkingFee(ticket, paymentProcessor);



    }
}
