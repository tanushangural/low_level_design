package lowLevelDesign.FoodDeliverySystem.apis;

import lowLevelDesign.FoodDeliverySystem.data.Order;
import lowLevelDesign.FoodDeliverySystem.data.User;
import lowLevelDesign.FoodDeliverySystem.enums.OrderStatus;
import lowLevelDesign.FoodDeliverySystem.managers.OrderManager;
import lowLevelDesign.FoodDeliverySystem.managers.UserManager;

public class UpdateOrderAPI {
    private final UserManager userManager = new UserManager();
    private final OrderManager orderManager = new OrderManager();
    public void updateOrder(int orderId, OrderStatus newOrderStatus, String token) {
        User user = userManager.getUserByToken(token);
        Order order = orderManager.getOrder(orderId);

    }
}
