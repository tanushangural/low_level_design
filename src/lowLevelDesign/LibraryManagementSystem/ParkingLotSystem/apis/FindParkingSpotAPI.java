package lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.apis;

import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.EntryPoint;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.ParkingSpot;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.SpotSelectionStartegy;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.VehicleType;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.factory.SpotSelectorFactory;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.factory.VehicleTypeManagerFactory;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.finder.ParkingSpotFinder;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.manager.VehicleTypeManager;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.selector.ParkingSpotSelector;

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
