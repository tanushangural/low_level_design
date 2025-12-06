package lowLevelDesign.ParkingLotSystem.apis;

import lowLevelDesign.ParkingLotSystem.data.EntryPoint;
import lowLevelDesign.ParkingLotSystem.data.ParkingSpot;
import lowLevelDesign.ParkingLotSystem.data.SpotSelectionStartegy;
import lowLevelDesign.ParkingLotSystem.data.VehicleType;
import lowLevelDesign.ParkingLotSystem.factory.SpotSelectorFactory;
import lowLevelDesign.ParkingLotSystem.factory.VehicleTypeManagerFactory;
import lowLevelDesign.ParkingLotSystem.finder.ParkingSpotFinder;
import lowLevelDesign.ParkingLotSystem.manager.VehicleTypeManager;
import lowLevelDesign.ParkingLotSystem.selector.ParkingSpotSelector;

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

/*

high levels apis

void sendNotification (Notification notification, List<Channel> channels, User user);



*/
