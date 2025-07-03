package ParkingLotSystem.apis;

import ParkingLotSystem.data.Ticket;
import ParkingLotSystem.payments.ParkingFeeProcessor;

public class GetParkingFeeAPI {
    public double getParkingFee(Ticket ticket) {
        ParkingFeeProcessor parkingFeeProcessor = new ParkingFeeProcessor();
        return parkingFeeProcessor.getParkingFee(ticket);
    }
}
