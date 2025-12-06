package lowLevelDesign.FoodDeliverySystem.searchers;

import lowLevelDesign.FoodDeliverySystem.data.DataAccessObjectConverter;
import lowLevelDesign.FoodDeliverySystem.data.DataAccessor;
import lowLevelDesign.FoodDeliverySystem.data.DataAccessorResult;
import lowLevelDesign.FoodDeliverySystem.data.FoodItem;
import lowLevelDesign.FoodDeliverySystem.filter.FoodItemFilter;

import java.util.ArrayList;
import java.util.List;

public class FoodItemSearcher {

    public FoodItem getFoodItemById(int id) {
        return null;
    }

    public List<FoodItem> search(String foodItemName, List<FoodItemFilter> foodItemFilterList) {
        if(foodItemName == null || foodItemName.length() == 0 || foodItemFilterList == null) {
            throw new IllegalArgumentException("Missing params");
        }
        DataAccessorResult dataAccessResult = DataAccessor.getFoodItemWithName(foodItemName);
        List<FoodItem> foodItemList = DataAccessObjectConverter.convertToFoodItems(dataAccessResult);
        for(FoodItemFilter foodItemFilter: foodItemFilterList) {
            List<FoodItem> curFilteredFoodItem = new ArrayList<>();
            for(FoodItem foodItem: foodItemList) {
                if(foodItemFilter.filter(foodItem)) {
                    curFilteredFoodItem.add(foodItem);
                }
            }
            foodItemList = curFilteredFoodItem;
        }
        return foodItemList;
    }
}
