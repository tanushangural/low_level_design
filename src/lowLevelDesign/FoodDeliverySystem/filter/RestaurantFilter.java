package lowLevelDesign.FoodDeliverySystem.filter;

import lowLevelDesign.FoodDeliverySystem.data.Restaurant;

public interface RestaurantFilter {
    boolean filter(Restaurant restaurant);
}
