package lowLevelDesign.ParkingLotSystem.factory;

import lowLevelDesign.ParkingLotSystem.data.EntryPoint;
import lowLevelDesign.ParkingLotSystem.selector.NearestParkingSpotSelector;
import lowLevelDesign.ParkingLotSystem.selector.ParkingSpotSelector;
import lowLevelDesign.ParkingLotSystem.selector.RandomParkingSpotSelector;

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
