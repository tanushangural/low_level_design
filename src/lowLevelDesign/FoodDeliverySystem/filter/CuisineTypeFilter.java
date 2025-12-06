package lowLevelDesign.FoodDeliverySystem.filter;

import lowLevelDesign.FoodDeliverySystem.data.CuisineType;
import lowLevelDesign.FoodDeliverySystem.data.FoodItem;
import lowLevelDesign.FoodDeliverySystem.data.Restaurant;

import java.util.List;

public class CuisineTypeFilter implements FoodItemFilter,RestaurantFilter {
    private final List<CuisineType> cuisineTypeList;

    public CuisineTypeFilter(List<CuisineType> cuisineTypeList) {
        this.cuisineTypeList = cuisineTypeList;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return cuisineTypeList.contains(foodItem.getCuisineType());
    }

    @Override
    public boolean filter(Restaurant restaurant) {
        List<CuisineType> cuisineTypes = restaurant.getCuisineTypeList();
        for(CuisineType cuisineType : cuisineTypes) {
            if(cuisineTypeList.contains(cuisineType)) {
                return true;
            }
        }
        return false;
    }
}
