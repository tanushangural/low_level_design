package lowLevelDesign.FoodDeliverySystem.factory;

import lowLevelDesign.FoodDeliverySystem.data.FoodItem;
import lowLevelDesign.FoodDeliverySystem.data.Order;
import lowLevelDesign.FoodDeliverySystem.data.User;
import lowLevelDesign.FoodDeliverySystem.enums.OrderStatus;
import lowLevelDesign.FoodDeliverySystem.permissions.*;

public class PermissionFactory {
    private PermissionFactory() {}

    public static Permission getAddToCartPermission(User user, FoodItem foodItem) {
        return new AddToCartPermission(user, foodItem);
    }

    public static Permission getCheckoutCartPermission(User user) {
        return new CheckoutCartPermission(user);
    }

    public static Permission getDeleteFromCardPermission(User user, FoodItem foodItem) {
        return new DeleteFromCartPermission(user, foodItem);
    }

    public static Permission getPlaceOrderPermission(User user) {
        return new PlaceOrderPermission(user);
    }

    public static Permission getUpdateOrderPermission(User user, Order order, OrderStatus orderStatus) {
        return new UpdateOrderPermission(user, order, orderStatus);
    }
}
