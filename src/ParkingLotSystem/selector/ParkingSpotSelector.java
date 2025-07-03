package ParkingLotSystem.selector;

import ParkingLotSystem.data.ParkingSpot;

import java.util.List;

public interface ParkingSpotSelector {
    default ParkingSpot selectSpot(List<ParkingSpot> parkingSpots) {
        return null;
    }
}
