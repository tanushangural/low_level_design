package lowLevelDesign.ParkingLotSystem.manager;

import lowLevelDesign.ParkingLotSystem.data.ParkingSpot;

import java.util.List;

public class TwoWheelerManager implements VehicleTypeManager {

    @Override
    public List<ParkingSpot> getParkingSpots() {
        return null;
    }

    @Override
    public double getParkingFee(double durationInHours) {
        return 0;
    }
}
