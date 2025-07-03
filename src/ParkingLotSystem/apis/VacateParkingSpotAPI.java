package ParkingLotSystem.apis;

import ParkingLotSystem.data.ParkingSpot;
import ParkingLotSystem.vacator.ParkingSpotVacator;

public class VacateParkingSpotAPI {
    public void vacateParkingSpot(ParkingSpot parkingSpot) {
        new ParkingSpotVacator().vacateParkingSpot(parkingSpot);
    }
}
