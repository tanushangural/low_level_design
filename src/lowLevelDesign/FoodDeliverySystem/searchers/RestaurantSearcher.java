package lowLevelDesign.FoodDeliverySystem.searchers;

import lowLevelDesign.FoodDeliverySystem.data.*;
import lowLevelDesign.FoodDeliverySystem.filter.RestaurantFilter;

import java.util.ArrayList;
import java.util.List;

public class RestaurantSearcher {

    public Restaurant getRestaurantById(int id) {
        return null;
    }

    public List<Restaurant> search(String restaurantName, List<RestaurantFilter> filters) {
        // parameter checks

        DataAccessorResult dataAccessResult = DataAccessor.getRestaurantsWithName(restaurantName);
        List<Restaurant> restaurants = DataAccessObjectConverter.convertToRestaurants(dataAccessResult);

        for(RestaurantFilter restaurantFilter: filters) {
            List<Restaurant> filteredRestaurants = new ArrayList<>();
            for(Restaurant restaurant: restaurants) {
                if(restaurantFilter.filter(restaurant)) {
                    filteredRestaurants.add(restaurant);
                }
            }
            restaurants = filteredRestaurants;
        }
        return restaurants;
    }


}
