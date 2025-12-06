package lowLevelDesign.FoodDeliverySystem.managers;

import lowLevelDesign.FoodDeliverySystem.data.*;
import lowLevelDesign.FoodDeliverySystem.enums.OrderStatus;
import lowLevelDesign.FoodDeliverySystem.factory.PermissionFactory;
import lowLevelDesign.FoodDeliverySystem.permissions.Permission;

import java.util.List;

public class OrderManager {
    public Order placeOrder(User user) {
        Permission permission = PermissionFactory.getPlaceOrderPermission(user);
        if(!permission.isPermitted()) {
            throw new RuntimeException("Place Order permission denied");
        }
        CartManager cartManager = new CartManager();
        List<CartItem> cartItems = cartManager.getUserCart(user);
        int orderId = DataAccessor.createOrder(user, cartItems);
        cartManager.checkoutUserCart(user);
        return new Order(orderId, cartItems, OrderStatus.PLACED, user.getId());
    }

    public List<Order> getOrders(User user) {
        return null;
    }

    public Order getOrder(int orderId) {
        return null;
    }

    public void updateOrder(Order order, User user, OrderStatus orderStatus) {

    }

    private void setOrderToCooking(Order order, User user) {
        Permission permission = PermissionFactory.getUpdateOrderPermission(user, order, OrderStatus.COOKING);
        if(!permission.isPermitted()) {
            throw new RuntimeException("Update Order Permission Denied");
        }
        if(!order.getOrderStatus().equals(OrderStatus.PLACED)) {
            throw new RuntimeException("Only Order placed moved to cooking");
        }
        // update method to update in database using dataAccessor
    }

}
