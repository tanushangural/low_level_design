package lowLevelDesign.ParkingLotSystem.factory;

import lowLevelDesign.ParkingLotSystem.data.VehicleType;
import lowLevelDesign.ParkingLotSystem.manager.FourWheelerManager;
import lowLevelDesign.ParkingLotSystem.manager.HeavyVehicleManager;
import lowLevelDesign.ParkingLotSystem.manager.TwoWheelerManager;
import lowLevelDesign.ParkingLotSystem.manager.VehicleTypeManager;

public class VehicleTypeManagerFactory {
    private VehicleTypeManagerFactory() {
        // Private constructor to prevent instantiation
    }

    public static VehicleTypeManager getVehicleTypeManager(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER:
                return new TwoWheelerManager();
            case FOUR_WHEELER:
                return new FourWheelerManager();
            case HEAVY_VEHICLE:
                return new HeavyVehicleManager();
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }
    }
}
