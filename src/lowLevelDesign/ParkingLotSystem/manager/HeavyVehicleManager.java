package lowLevelDesign.ParkingLotSystem.manager;

import lowLevelDesign.ParkingLotSystem.data.ParkingSpot;

import java.util.List;

public class HeavyVehicleManager implements VehicleTypeManager {

    @Override
    public List<ParkingSpot> getParkingSpots() {
        // Logic to retrieve parking spots for heavy vehicles
        return null; // Placeholder return
    }

    @Override
    public double getParkingFee(double durationInHours) {
        // Logic to calculate parking fee for heavy vehicles
        return 0; // Placeholder return
    }
}
