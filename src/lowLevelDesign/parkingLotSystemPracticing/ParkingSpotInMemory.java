package lowLevelDesign.parkingLotSystemPracticing;

import lowLevelDesign.parkingLotSystemPracticing.data.ParkingSpot;
import lowLevelDesign.parkingLotSystemPracticing.enums.VehicleType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingSpotInMemory {
    public static List<ParkingSpot> list = new ArrayList<>(Arrays.asList(
            new ParkingSpot(null, VehicleType.TWO_WHEELER, 1, true, 1),
            new ParkingSpot(null, VehicleType.TWO_WHEELER, 1, true, 2),
            new ParkingSpot(null, VehicleType.FOUR_WHEELER, 1, true, 3),
            new ParkingSpot(null, VehicleType.FOUR_WHEELER, 1, true, 4),
            new ParkingSpot(null, VehicleType.FOUR_WHEELER, 2, true, 5),
            new ParkingSpot(null, VehicleType.HEAVY_WHEELER, 2, true, 6),
            new ParkingSpot(null, VehicleType.HEAVY_WHEELER, 2, true, 7)
    ));

    public static ParkingSpot getAnyAvailableParkingSpotByVehicleType(VehicleType vehicleType) {
        for(ParkingSpot parkingSpot: list) {
            if(vehicleType.equals(parkingSpot.getVehicleType()) && parkingSpot.getAvl()) {
                return parkingSpot;
            }
        }
        return null;
    }

    public static void updateParkingSpot(ParkingSpot parkingSpot) {
        for(ParkingSpot currentParkingSpot: list) {
            if(parkingSpot.getParkingSpotId().equals(currentParkingSpot.getParkingSpotId())) {
                currentParkingSpot.setVehicle(parkingSpot.getVehicle());
                currentParkingSpot.setAvl(parkingSpot.getAvl());
            }
        }
    }
}
