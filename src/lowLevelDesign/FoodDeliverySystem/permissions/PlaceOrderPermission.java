package lowLevelDesign.FoodDeliverySystem.permissions;

import lowLevelDesign.FoodDeliverySystem.data.User;

public class PlaceOrderPermission implements Permission{
    private final User user;

    public PlaceOrderPermission(User user) {
        this.user = user;
    }

    @Override
    public boolean isPermitted() {
        return false;
    }
}
