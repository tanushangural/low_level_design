package FoodDeliverySystem;

public class Controller {
}

/*
APIS

1. Food item search api
i/p: food item name, filter...
o/p: list<fooditem>

2. Restaurent search api
i/p: Restaurent name, filter...
o/p: list<Restaurent>

3. Get restById api
i/p int rid
o/p: resturent

4. Get fooditemById api
i/p int fooditemId
o/p fooditem

5. Add to card api
i/p userToken, foodItemId
o/p void

6. place order api
i/p usertoken, paymentMode, paymentInfo
o/p orderDetails

7. update order api
i/p orderStatus, orderId, usertoken
o/p void 
* */

/*
* Food Delivery System - Requirements

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