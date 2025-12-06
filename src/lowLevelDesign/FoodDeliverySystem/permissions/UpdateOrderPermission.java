package lowLevelDesign.FoodDeliverySystem.permissions;

import lowLevelDesign.FoodDeliverySystem.data.Order;
import lowLevelDesign.FoodDeliverySystem.data.User;
import lowLevelDesign.FoodDeliverySystem.enums.OrderStatus;

public class UpdateOrderPermission implements Permission{
    private final User user;
    private final Order order;
    private final OrderStatus orderStatus;

    public UpdateOrderPermission(User user, Order order, OrderStatus orderStatus) {
        this.user = user;
        this.order = order;
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean isPermitted() {
        return false;
    }
}
