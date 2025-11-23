package lowLevelDesign.parkingLotSystemPracticing.factory;

import lowLevelDesign.parkingLotSystemPracticing.PaymentManager.CardPaymentManager;
import lowLevelDesign.parkingLotSystemPracticing.PaymentManager.PaymentManager;
import lowLevelDesign.parkingLotSystemPracticing.enums.PaymentMode;

public class PaymentManagerFactory {
    private PaymentManagerFactory() {}

    public static PaymentManager getPaymentManager(PaymentMode paymentMode) {
        switch (paymentMode) {
            case CARD: return new CardPaymentManager();
            default: return new CardPaymentManager();
        }
    }
}
