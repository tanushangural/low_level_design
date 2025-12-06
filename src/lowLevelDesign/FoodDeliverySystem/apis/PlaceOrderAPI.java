package lowLevelDesign.FoodDeliverySystem.apis;

import lowLevelDesign.FoodDeliverySystem.data.Order;
import lowLevelDesign.FoodDeliverySystem.data.PaymentResponse;
import lowLevelDesign.FoodDeliverySystem.data.User;
import lowLevelDesign.FoodDeliverySystem.enums.PaymentMode;
import lowLevelDesign.FoodDeliverySystem.enums.PaymentStatus;
import lowLevelDesign.FoodDeliverySystem.factory.PaymentManagerFactory;
import lowLevelDesign.FoodDeliverySystem.managers.OrderManager;
import lowLevelDesign.FoodDeliverySystem.managers.PaymentManager;
import lowLevelDesign.FoodDeliverySystem.managers.UserManager;

import java.util.Map;

public class PlaceOrderAPI {
    private final UserManager userManager = new UserManager();
    private final OrderManager orderManager = new OrderManager();
    public Order placeOrder(String userToken, Map<String, String> paymentInfo, PaymentMode paymentMode) {
        if(userToken == null || userToken.length() == 0 || paymentMode == null || paymentInfo == null || paymentInfo.isEmpty()) {
            throw new RuntimeException("Invalid Params");
        }
        User user = userManager.getUserByToken(userToken);
        if(user == null) {
            throw new RuntimeException("Invalid token");
        }
        PaymentManager paymentManager = PaymentManagerFactory.getPaymentManager(paymentMode, paymentInfo);
        PaymentResponse paymentResponse = paymentManager.executePayment();
        if(paymentResponse == null
                || paymentResponse.getPaymentStatus() == null
                || PaymentStatus.FAILURE.equals(paymentResponse.getPaymentStatus())) {
            throw new RuntimeException("Payment failed");
        }
        return orderManager.placeOrder(user);
    }
}
