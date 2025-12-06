package lowLevelDesign.FoodDeliverySystem.apis;

import lowLevelDesign.FoodDeliverySystem.data.FoodItem;
import lowLevelDesign.FoodDeliverySystem.searchers.FoodItemSearcher;

public class GetFoodItemByIdAPI {
    public FoodItem getFoodItemById(Integer id) {
        return new FoodItemSearcher().getFoodItemById(id);
    }
}
