package lowLevelDesign.FoodDeliverySystem.apis;

import lowLevelDesign.FoodDeliverySystem.data.Restaurant;
import lowLevelDesign.FoodDeliverySystem.searchers.RestaurantSearcher;

public class GetRestaurantByIdAPI {
    public Restaurant getRestaurantById(Integer restaurantId) {
        return new RestaurantSearcher().getRestaurantById(restaurantId);
    }
}
