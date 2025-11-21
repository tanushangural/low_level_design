package lowLevelDesign.ParkingLotSystem.apis;

import lowLevelDesign.ParkingLotSystem.data.ParkingSpot;
import lowLevelDesign.ParkingLotSystem.vacator.ParkingSpotVacator;

public class VacateParkingSpotAPI {
    public void vacateParkingSpot(ParkingSpot parkingSpot) {
        new ParkingSpotVacator().vacateParkingSpot(parkingSpot);
    }
}
