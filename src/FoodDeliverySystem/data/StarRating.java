package FoodDeliverySystem.data;

public enum StarRating {
    ONE_STAR(1),
    TWO_STAR(2),
    THREE_STAR(3),
    FOUR_STAR(4),
    FIVE_STAR(5);

    private final int rating;

    StarRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}
