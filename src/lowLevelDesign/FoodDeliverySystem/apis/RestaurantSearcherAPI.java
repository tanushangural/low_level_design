package lowLevelDesign.FoodDeliverySystem.apis;

import lowLevelDesign.FoodDeliverySystem.data.CuisineType;
import lowLevelDesign.FoodDeliverySystem.data.MealType;
import lowLevelDesign.FoodDeliverySystem.data.Restaurant;
import lowLevelDesign.FoodDeliverySystem.data.StarRating;
import lowLevelDesign.FoodDeliverySystem.filter.*;
import lowLevelDesign.FoodDeliverySystem.searchers.FoodItemSearcher;
import lowLevelDesign.FoodDeliverySystem.searchers.RestaurantSearcher;

import java.util.ArrayList;
import java.util.List;

public class RestaurantSearcherAPI {
    public List<Restaurant> searchRestaurant(String restaurant,
                                             List<CuisineType> cuisineTypeList,
                                             MealType mealType,
                                             StarRating starRating) {
        List<RestaurantFilter> filters = new ArrayList<>();
        if(mealType != null) {
            filters.add(new MealTypeFilter(mealType));
        }
        if(cuisineTypeList != null) {
            filters.add(new CuisineTypeFilter(cuisineTypeList));
        }
        if(starRating != null) {
            filters.add(new StarRatingFilter(starRating));
        }
        return new RestaurantSearcher().search(restaurant, filters);
    }
}
