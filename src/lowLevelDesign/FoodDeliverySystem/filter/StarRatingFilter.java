package lowLevelDesign.FoodDeliverySystem.filter;

import lowLevelDesign.FoodDeliverySystem.data.FoodItem;
import lowLevelDesign.FoodDeliverySystem.data.Restaurant;
import lowLevelDesign.FoodDeliverySystem.data.StarRating;

public class StarRatingFilter implements FoodItemFilter, RestaurantFilter{
    private final StarRating starRating;

    public StarRatingFilter(StarRating starRating) {
        this.starRating = starRating;
    }

    @Override
    public boolean filter(FoodItem foodItem) {
        return starRating.getVal() <= foodItem.getStarRating().getVal();
    }

    @Override
    public boolean filter(Restaurant restaurant) {
        return starRating.getVal() <= restaurant.getStarRating().getVal();
    }
}
