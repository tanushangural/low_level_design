package lowLevelDesign.FoodDeliverySystem.filter;

import lowLevelDesign.FoodDeliverySystem.data.FoodItem;
import lowLevelDesign.FoodDeliverySystem.data.MealType;
import lowLevelDesign.FoodDeliverySystem.data.Restaurant;

public class MealTypeFilter implements FoodItemFilter, RestaurantFilter{
    private final MealType mealType;

    public MealTypeFilter(MealType mealType) {
        this.mealType = mealType;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return foodItem.getMealType().equals(mealType);
    }

    @Override
    public boolean filter(Restaurant restaurant) {
        return mealType.equals(restaurant.getMealType());
    }
}
