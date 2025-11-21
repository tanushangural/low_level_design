package lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.apis;

import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.ParkingSpot;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.vacator.ParkingSpotVacator;

public class VacateParkingSpotAPI {
    public void vacateParkingSpot(ParkingSpot parkingSpot) {
        new ParkingSpotVacator().vacateParkingSpot(parkingSpot);
    }
}
