package ParkingLotSystem.factory;

import ParkingLotSystem.data.VehicleType;
import ParkingLotSystem.manager.FourWheelerManager;
import ParkingLotSystem.manager.HeavyVehicleManager;
import ParkingLotSystem.manager.TwoWheelerManager;
import ParkingLotSystem.manager.VehicleTypeManager;

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
