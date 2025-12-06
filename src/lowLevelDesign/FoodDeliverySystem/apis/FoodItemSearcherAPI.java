package lowLevelDesign.FoodDeliverySystem.apis;

import lowLevelDesign.FoodDeliverySystem.data.CuisineType;
import lowLevelDesign.FoodDeliverySystem.data.FoodItem;
import lowLevelDesign.FoodDeliverySystem.data.MealType;
import lowLevelDesign.FoodDeliverySystem.data.StarRating;
import lowLevelDesign.FoodDeliverySystem.filter.CuisineTypeFilter;
import lowLevelDesign.FoodDeliverySystem.filter.FoodItemFilter;
import lowLevelDesign.FoodDeliverySystem.filter.MealTypeFilter;
import lowLevelDesign.FoodDeliverySystem.filter.StarRatingFilter;
import lowLevelDesign.FoodDeliverySystem.searchers.FoodItemSearcher;

import java.util.ArrayList;
import java.util.List;

public class FoodItemSearcherAPI {

    public List<FoodItem> searchFoodItems(String foodItemName, MealType mealType, List<CuisineType> cuisineTypeList,
                                          StarRating starRating) {
        List<FoodItemFilter> filters = new ArrayList<>();
        if(mealType != null) {
            filters.add(new MealTypeFilter(mealType));
        }
        if(cuisineTypeList != null) {
            filters.add(new CuisineTypeFilter(cuisineTypeList));
        }
        if(starRating != null) {
            filters.add(new StarRatingFilter(starRating));
        }
        return new FoodItemSearcher().search(foodItemName, filters);
    }
}
