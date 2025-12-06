package lowLevelDesign.FoodDeliverySystem.data;

import java.util.List;

public class DataAccessor {
    private DataAccessor() {}

    public static void addItemToCart(User user, FoodItem foodItem) {
    }

    public static DataAccessorResult getFoodItemWithName(String foodItemName) {
        return null;
    }

    public static DataAccessorResult getRestaurantsWithName(String restaurantName) {
        return null;
    }

    public static DataAccessorResult getCart(User user) {
        return null;
    }

    public static void checkoutCart(User user) {
    }

    public static int createOrder(User user, List<CartItem> cartItemList) {
        return 1;
    }
}
