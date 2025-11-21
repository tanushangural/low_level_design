package lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.payments;

import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.Ticket;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.VehicleType;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.factory.VehicleTypeManagerFactory;

public class ParkingFeeProcessor {
    public double getParkingFee(Ticket ticket) {
        double duration = 0;
        // figure out the duration of parking based on the ticket from db


        VehicleType vehicleType = ticket.getVehicle().getVehicleType();
        return VehicleTypeManagerFactory.getVehicleTypeManager(vehicleType).getParkingFee(duration);
    }

    public boolean processParkingFee(Ticket ticket, PaymentProcessor paymentProcessor) {
        double parkingFee = getParkingFee(ticket);
        if(parkingFee != paymentProcessor.getAmount()) {
            throw new IllegalArgumentException("Payment amount does not match the parking fee.");
        }
        return paymentProcessor.executePayment();
    }
}
