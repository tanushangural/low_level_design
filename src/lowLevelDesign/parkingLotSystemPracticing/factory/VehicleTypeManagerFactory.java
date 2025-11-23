package lowLevelDesign.parkingLotSystemPracticing.factory;

import lowLevelDesign.parkingLotSystemPracticing.enums.VehicleType;
import lowLevelDesign.parkingLotSystemPracticing.vehicleTypeManager.FourWheelerVehicleTypeManager;
import lowLevelDesign.parkingLotSystemPracticing.vehicleTypeManager.HeavyWheelerVehicleTypeManager;
import lowLevelDesign.parkingLotSystemPracticing.vehicleTypeManager.TwoWheelerVehicleTypeManager;
import lowLevelDesign.parkingLotSystemPracticing.vehicleTypeManager.VehicleTypeManager;

public class VehicleTypeManagerFactory {
    private VehicleTypeManagerFactory() {}

    public static VehicleTypeManager getVehicleTypeManager(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER: return new TwoWheelerVehicleTypeManager();
            case FOUR_WHEELER: return new FourWheelerVehicleTypeManager();
            case HEAVY_WHEELER: return new HeavyWheelerVehicleTypeManager();
            default: return new HeavyWheelerVehicleTypeManager();
        }
    }
}
