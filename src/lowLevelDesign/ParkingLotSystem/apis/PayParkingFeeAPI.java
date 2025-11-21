package lowLevelDesign.ParkingLotSystem.apis;

import lowLevelDesign.ParkingLotSystem.data.CardDetails;
import lowLevelDesign.ParkingLotSystem.data.PaymentMode;
import lowLevelDesign.ParkingLotSystem.data.Ticket;
import lowLevelDesign.ParkingLotSystem.factory.PaymentProcessorFactory;
import lowLevelDesign.ParkingLotSystem.payments.ParkingFeeProcessor;
import lowLevelDesign.ParkingLotSystem.payments.PaymentProcessor;

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
