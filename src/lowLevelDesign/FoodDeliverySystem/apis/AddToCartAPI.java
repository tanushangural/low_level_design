package lowLevelDesign.FoodDeliverySystem.apis;

import lowLevelDesign.FoodDeliverySystem.data.FoodItem;
import lowLevelDesign.FoodDeliverySystem.data.User;
import lowLevelDesign.FoodDeliverySystem.managers.CartManager;
import lowLevelDesign.FoodDeliverySystem.managers.UserManager;
import lowLevelDesign.FoodDeliverySystem.searchers.FoodItemSearcher;

public class AddToCartAPI {

    private final UserManager userManager = new UserManager();
    private final FoodItemSearcher foodItemSearcher = new FoodItemSearcher();
    private final CartManager cartManager = new CartManager();

    public void addToCart(int foodItemId, String userToken) throws Exception {
        if(userToken == null || userToken.length() == 0 || foodItemId < 0) {
            throw new IllegalArgumentException("Illegal arguments");
        }
        User user  = userManager.getUserByToken(userToken);
        if(user == null) {
            throw new Exception("No user for given token");
        }
        FoodItem foodItem = foodItemSearcher.getFoodItemById(foodItemId);
        if(foodItem == null) {
            throw new Exception("No FoodItem for given id");
        }
        cartManager.addItemToCart(user,foodItem);
    }

}
