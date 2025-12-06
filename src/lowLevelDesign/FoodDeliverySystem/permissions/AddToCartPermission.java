package lowLevelDesign.FoodDeliverySystem.permissions;

import lowLevelDesign.FoodDeliverySystem.data.Address;
import lowLevelDesign.FoodDeliverySystem.data.FoodItem;
import lowLevelDesign.FoodDeliverySystem.data.Restaurant;
import lowLevelDesign.FoodDeliverySystem.data.User;
import lowLevelDesign.FoodDeliverySystem.managers.DeliveryManager;
import lowLevelDesign.FoodDeliverySystem.searchers.RestaurantSearcher;

public class AddToCartPermission implements Permission{
    private final User user;
    private final FoodItem foodItem;
    private final DeliveryManager deliveryManager = new DeliveryManager();

    public AddToCartPermission(User user, FoodItem foodItem) {
        this.user = user;
        this.foodItem = foodItem;
    }

    @Override
    public boolean isPermitted() {
        if(!foodItem.isAvailable()) {
            return false;
        }
        Address restaurantAddress = new RestaurantSearcher().getRestaurantById(foodItem.getRestaurentId()).getAddress();
        Address userAddress = user.getAddress();
        if(deliveryManager.isDeliveryPossible(restaurantAddress, userAddress)) {
            return true;
        }
        return false;
    }
}
