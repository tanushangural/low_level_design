package lowLevelDesign.FoodDeliverySystem.factory;

import lowLevelDesign.FoodDeliverySystem.enums.PaymentMode;
import lowLevelDesign.FoodDeliverySystem.managers.CardPaymentManager;
import lowLevelDesign.FoodDeliverySystem.managers.NetbankingPaymentManager;
import lowLevelDesign.FoodDeliverySystem.managers.PaymentManager;

import java.util.Map;

public class PaymentManagerFactory {
    private PaymentManagerFactory() {}

    public static PaymentManager getPaymentManager(PaymentMode paymentMode, Map<String, String> paymentInfo) {
        if(paymentMode.equals(PaymentMode.CARD)) {
            return getNetBankingPaymentManager(paymentInfo);
        }
        else if(paymentMode.equals(PaymentMode.NETBANKING)) {
            return getCardPaymentManager(paymentInfo);
        }
        return null;
    }

    private static PaymentManager getNetBankingPaymentManager(Map<String, String> paymentInfo) {
        return new NetbankingPaymentManager(paymentInfo.get("bankName"),
                paymentInfo.get("userName"),
                paymentInfo.get("password"),
                paymentInfo.get("pin"),
                Double.parseDouble(paymentInfo.get("double"))
        );
    }

    private static PaymentManager getCardPaymentManager(Map<String, String> paymentInfo) {
        return new CardPaymentManager(paymentInfo.get("bankName"),
                paymentInfo.get("userName"),
                paymentInfo.get("cardNumber"),
                paymentInfo.get("pin"),
                Double.parseDouble(paymentInfo.get("double"))
        );
    }


}
