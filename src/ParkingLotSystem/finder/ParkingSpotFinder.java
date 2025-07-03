package ParkingLotSystem.finder;

import ParkingLotSystem.data.ParkingSpot;
import ParkingLotSystem.manager.VehicleTypeManager;
import ParkingLotSystem.selector.ParkingSpotSelector;

import java.util.List;

public class ParkingSpotFinder  {
    private final VehicleTypeManager vehicleTypeManager;
    private final ParkingSpotSelector parkingSpotSelector;

    public ParkingSpotFinder(VehicleTypeManager vehicleTypeManager,
                              ParkingSpotSelector parkingSpotSelector) {
        this.vehicleTypeManager = vehicleTypeManager;
        this.parkingSpotSelector = parkingSpotSelector;
    }

    public ParkingSpot findParkingSpot() {
        List<ParkingSpot> parkingSpots = vehicleTypeManager.getParkingSpots();
        if (parkingSpots.isEmpty()) {
            throw new IllegalStateException("No parking spots available");
        }
        return parkingSpotSelector.selectSpot(parkingSpots);
    }
}
