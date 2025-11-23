package lowLevelDesign.parkingLotSystemPracticing.apis;

import lowLevelDesign.parkingLotSystemPracticing.ParkingSpotManager;
import lowLevelDesign.parkingLotSystemPracticing.factory.VehicleTypeManagerFactory;
import lowLevelDesign.parkingLotSystemPracticing.data.ParkingSpot;
import lowLevelDesign.parkingLotSystemPracticing.data.Ticket;
import lowLevelDesign.parkingLotSystemPracticing.data.Vehicle;
import lowLevelDesign.parkingLotSystemPracticing.enums.VehicleType;
import lowLevelDesign.parkingLotSystemPracticing.vehicleTypeManager.VehicleTypeManager;

public class EntryParkingSpotAPI {

    public Ticket entryParkingSpot(Vehicle vehicle, VehicleType vehicleType) {
        // param validation checks
        if(vehicle == null || vehicleType == null) {
            throw new IllegalArgumentException("invalid params");
        }

        ParkingSpotManager parkingSpotManager = new ParkingSpotManager(vehicle, vehicleType);
        ParkingSpot parkingSpot  = parkingSpotManager.findAndAllocateParkingSpot();
        return new Ticket(parkingSpot, vehicle, vehicleType);
    }
}
