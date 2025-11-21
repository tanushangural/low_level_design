package lowLevelDesign.ParkingLotSystem.apis;

import lowLevelDesign.ParkingLotSystem.data.Ticket;
import lowLevelDesign.ParkingLotSystem.payments.ParkingFeeProcessor;

public class GetParkingFeeAPI {
    public double getParkingFee(Ticket ticket) {
        ParkingFeeProcessor parkingFeeProcessor = new ParkingFeeProcessor();
        return parkingFeeProcessor.getParkingFee(ticket);
    }
}
