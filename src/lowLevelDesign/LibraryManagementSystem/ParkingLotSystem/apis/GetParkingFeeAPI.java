package lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.apis;

import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.Ticket;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.payments.ParkingFeeProcessor;

public class GetParkingFeeAPI {
    public double getParkingFee(Ticket ticket) {
        ParkingFeeProcessor parkingFeeProcessor = new ParkingFeeProcessor();
        return parkingFeeProcessor.getParkingFee(ticket);
    }
}
