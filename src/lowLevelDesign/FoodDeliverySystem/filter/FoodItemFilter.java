package lowLevelDesign.FoodDeliverySystem.filter;

import lowLevelDesign.FoodDeliverySystem.data.FoodItem;

public interface FoodItemFilter {
    boolean filter(FoodItem foodItem);
}
