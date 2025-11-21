package lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.factory;

import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.EntryPoint;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.selector.NearestParkingSpotSelector;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.selector.ParkingSpotSelector;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.selector.RandomParkingSpotSelector;

public class SpotSelectorFactory {
    private SpotSelectorFactory() {
        // Private constructor to prevent instantiation
    }

    public static ParkingSpotSelector getNearestSpotSelector(EntryPoint entryPoint) {
        return new NearestParkingSpotSelector(entryPoint);
    }

    public static ParkingSpotSelector getRandomSpotSelector() {
        return new RandomParkingSpotSelector();
    }
}
