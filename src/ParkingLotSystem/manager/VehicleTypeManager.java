package ParkingLotSystem.manager;

import ParkingLotSystem.data.ParkingSpot;

import java.util.List;

public interface VehicleTypeManager {
    List<ParkingSpot> getParkingSpots();
    double getParkingFee(double durationInHours);
}
