package lowLevelDesign.FoodDeliverySystem.data;

import lowLevelDesign.FoodDeliverySystem.enums.OrderStatus;

import java.util.List;

public class Order {
    private final int orderId;
    private final List<CartItem> cartItemList;
    private final OrderStatus orderStatus;
    private final int userId;

    public Order(int orderId, List<CartItem> cartItemList, OrderStatus orderStatus, int userId) {
        this.orderId = orderId;
        this.cartItemList = cartItemList;
        this.orderStatus = orderStatus;
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public int getUserId() {
        return userId;
    }
}
