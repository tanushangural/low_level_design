package ParkingLotSystem.factory;

import ParkingLotSystem.data.EntryPoint;
import ParkingLotSystem.data.SpotSelectionStartegy;
import ParkingLotSystem.selector.NearestParkingSpotSelector;
import ParkingLotSystem.selector.ParkingSpotSelector;
import ParkingLotSystem.selector.RandomParkingSpotSelector;

import static ParkingLotSystem.data.SpotSelectionStartegy.NEAREST;
import static ParkingLotSystem.data.SpotSelectionStartegy.RANDOM;

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
