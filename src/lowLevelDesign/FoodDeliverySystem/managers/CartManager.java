package lowLevelDesign.FoodDeliverySystem.managers;

import lowLevelDesign.FoodDeliverySystem.data.*;
import lowLevelDesign.FoodDeliverySystem.factory.PermissionFactory;
import lowLevelDesign.FoodDeliverySystem.permissions.Permission;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class CartManager {


    public List<CartItem> getUserCart(User user) {
        DataAccessorResult dataAccessorResult = DataAccessor.getCart(user);
        List<CartItem> cartItems = DataAccessObjectConverter.convertToCardItems(dataAccessorResult);
        return null;
    }

    // add one unit only
    public void addItemToCart(User user, FoodItem foodItem) {
        Permission permission = PermissionFactory.getAddToCartPermission(user, foodItem);
        if(!permission.isPermitted()) {
            throw new RuntimeException("Permission Denied");
        }
        if(!isFoodItemFromSameRestaurant(foodItem, user)) {
            throw new RuntimeException("Cart contain items from different Restaurant");
        }
        DataAccessor.addItemToCart(user, foodItem);

    }

    // remove one unit only
    public void removeItemToCart(User user, FoodItem foodItem) {

    }

    public void checkoutUserCart(User user) {
        Permission permission = PermissionFactory.getCheckoutCartPermission(user);
        if(!permission.isPermitted()) {
            throw new RuntimeException("Permission Denied");
        }
        if(isCartEmpty(user)) {
            throw new RuntimeException("Empty Cart");
        }
        DataAccessor.checkoutCart(user);
    }

    private boolean isFoodItemFromSameRestaurant(FoodItem foodItem, User user) {
        List<CartItem> cartItems = getUserCart(user);
        return cartItems.isEmpty()
                || cartItems.get(0).getFoodItem().getRestaurentId() == foodItem.getRestaurentId();
    }

    private boolean isCartEmpty(User user) {
        List<CartItem> cartItems = getUserCart(user);
        return cartItems.isEmpty();
    }
}

// cart table
// id, user_id, food_item_id, qty, status
