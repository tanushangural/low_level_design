package lowLevelDesign.FoodDeliverySystem.data;

import java.util.List;

public class Restaurant {
    private final int restaurantId;
    private final String restaurantName;
    private final String Description;

    private final Menu menu;
    private final BusinessHours businessHours;
    private final StarRating starRating;
    private final List<CuisineType> cuisineTypeList;
    private final MealType mealType;
    private final Address address;


    public Restaurant(int restaurantId, String restaurantName, String description, Menu menu, BusinessHours businessHours, StarRating starRating, List<CuisineType> cuisineTypeList, MealType mealType, Address address) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        Description = description;
        this.menu = menu;
        this.businessHours = businessHours;
        this.starRating = starRating;
        this.cuisineTypeList = cuisineTypeList;
        this.mealType = mealType;
        this.address = address;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getDescription() {
        return Description;
    }

    public Menu getMenu() {
        return menu;
    }

    public BusinessHours getBusinessHours() {
        return businessHours;
    }

    public StarRating getStarRating() {
        return starRating;
    }


    public List<CuisineType> getCuisineTypeList() {
        return cuisineTypeList;
    }

    public Address getAddress() {
        return address;
    }

    public MealType getMealType() {
        return mealType;
    }
}
