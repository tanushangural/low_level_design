package ParkingLotSystem.selector;

import ParkingLotSystem.data.EntryPoint;
import ParkingLotSystem.data.ParkingSpot;

import java.util.List;

public class NearestParkingSpotSelector implements ParkingSpotSelector {

    private final EntryPoint entryPoint;

    public NearestParkingSpotSelector(EntryPoint entryPoint) {
        this.entryPoint = entryPoint;
    }

    @Override
    public ParkingSpot selectSpot(List<ParkingSpot> parkingSpots) {
        if (parkingSpots == null || parkingSpots.isEmpty()) {
            return null; // No available parking spots
        }

        return null;

    }
}
