package FoodDeliverySystem.data;

public class FoodItem {
    private final int id;
    private final String name;
    private final String Description;
    private final MealType mealType;
    private final CuisineType cuisineType;
    private final StarRating starRating;
    private final double price;
    private final int restaurantId;
    private final boolean isAvailable;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public MealType getMealType() {
        return mealType;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public double getPrice() {
        return price;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }




    // Can be use Builder pattern instead of constructor for better readability and maintainability
    public FoodItem(int id, String name, String description, MealType mealType, CuisineType cuisineType, StarRating starRating, double price, int restaurantId, boolean isAvailable) {
        this.id = id;
        this.name = name;
        Description = description;
        this.mealType = mealType;
        this.cuisineType = cuisineType;
        this.starRating = starRating;
        this.price = price;
        this.restaurantId = restaurantId;
        this.isAvailable = isAvailable;
    }
}
