package ParkingLotSystem.apis;

import ParkingLotSystem.data.EntryPoint;
import ParkingLotSystem.data.ParkingSpot;
import ParkingLotSystem.data.SpotSelectionStartegy;
import ParkingLotSystem.data.VehicleType;
import ParkingLotSystem.factory.SpotSelectorFactory;
import ParkingLotSystem.factory.VehicleTypeManagerFactory;
import ParkingLotSystem.finder.ParkingSpotFinder;
import ParkingLotSystem.manager.VehicleTypeManager;
import ParkingLotSystem.selector.ParkingSpotSelector;

public class FindParkingSpotAPI {
    public ParkingSpot findParkingSpot(EntryPoint entryPoint,
                                       VehicleType vehicleType,
                                       SpotSelectionStartegy strategy) {

        VehicleTypeManager vehicleTypeManager =
                VehicleTypeManagerFactory.getVehicleTypeManager(vehicleType);

        ParkingSpotSelector parkingSpotSelector;
        if(strategy.equals(SpotSelectionStartegy.RANDOM)) {
            parkingSpotSelector = SpotSelectorFactory.getRandomSpotSelector();
        } else if(strategy.equals(SpotSelectionStartegy.NEAREST)) {
            parkingSpotSelector = SpotSelectorFactory.getNearestSpotSelector(entryPoint);
        }
        else {
            throw new IllegalArgumentException("Invalid spot selection strategy: " + strategy);
        }

        ParkingSpotFinder parkingSpotFinder =
                new ParkingSpotFinder(vehicleTypeManager, parkingSpotSelector);
        return parkingSpotFinder.findParkingSpot();
    }
}
