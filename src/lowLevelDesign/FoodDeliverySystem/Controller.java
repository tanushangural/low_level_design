package lowLevelDesign.FoodDeliverySystem;

public class Controller {
}


/*
1. Let’s Design a Food Delivery System Just like Zomato and Swiggy.

2. The first step is to gather requirements for our system.

3. In our system, users should be able to search for food items by their names. They should also be able to put some filters on the search like MealType i.e. Veg or Non Veg , Cuisine Type i.e. a Particular set of cuisines (Like Italian + German ).

4. For the fetched food items , users should be able to navigate to the corresponding restaurant , check the price-list and menu , add items to their cart and last but not least the user should be able to place an order.

5. Different Modes of Payment should be available i.e. NetBanking , CardBasedPayment etc.

6. A Cart can’t contain foodItems from multiple Restaurants.

7.User should be able to search for restaurants by their names.

8. Users should have the option to ADD or Remove FoodItems from their Cart.

9.The System should have important information about the User such as Delivery Address , Name , Phone Number to ensure the correct delivery.

10.User Should be able to Track order Status :

ORDER_PLACED ,

ORDER_PREPARING,

READY_FOR_DELIVERY ,

OUT_FOR_DELIVERYY,

ORDER_DELIVERED.

11. A User can also cancel the order if the cooking has not been started yet. That will change the order status as CANCELED.

12. The System should provide ETA for delivery.

13. Users should be able to provide their feedback for the order.

14. Restaurants should be able to register themselves to the system after the admin approved their registration.

15. Restaurants should be able to update costings , food items availability , Open and Close timings etc .

16. Users should be able to apply Coupon Codes On their purchase.

*/

/*
APIS:

1. searchFoodByName
input: foodItemName, List<Filter>
output: List<FoodItems>

2. searchByRestaurentName
input: restaurentName, List<Filter>
output List<Restaurent>

3. getRestaurentById
input: restaurentId
output: Restaurent

4. getFoodItemById
input: footItemId
output: FoodItem

5. addFoodItemToCard
input: List<FoodItem>, userToken
output: void

6. removeFoodItemFromCard
input: List<FoodItem>, userToken
output: void

7. placeOrder
input: paymentMode, paymentInformation, cartId, userToken
correct input will that we don't actually need to pass cartId because in backend we will have a the informations and we will have infor whether the cart item has been checkout and placed order
so
input: paymentMode, paymentInformation,
output: Order


8. updateOrder
input: orderId, token, EXPECTED_ORDER_STATUS
output: order
*/