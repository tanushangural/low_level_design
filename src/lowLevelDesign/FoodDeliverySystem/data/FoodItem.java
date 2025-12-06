package lowLevelDesign.FoodDeliverySystem.data;

public class FoodItem {
    private final int id;
    private final String name;
    private final String description;
    private final StarRating starRating;
    private final CuisineType cuisineType;
    private final MealType mealType;
    private final Double priceINR;
    private final int restaurentId;
    private final boolean isAvailable;

    public FoodItem(int id, String name, String description, StarRating starRating, CuisineType cuisineType, MealType mealType, Double priceINR, int restaurentId, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.starRating = starRating;
        this.cuisineType = cuisineType;
        this.mealType = mealType;
        this.priceINR = priceINR;
        this.restaurentId = restaurentId;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public StarRating getStarRating() {
        return starRating;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public MealType getMealType() {
        return mealType;
    }

    public Double getPriceINR() {
        return priceINR;
    }

    public int getRestaurentId() {
        return restaurentId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

//private List<String> imageUrls;
// apply builder pattern here