package lowLevelDesign.parkingLotSystemPracticing.apis;

import lowLevelDesign.parkingLotSystemPracticing.ParkingSpotManager;
import lowLevelDesign.parkingLotSystemPracticing.PaymentManager.PaymentManager;
import lowLevelDesign.parkingLotSystemPracticing.enums.PaymentMode;
import lowLevelDesign.parkingLotSystemPracticing.factory.PaymentManagerFactory;
import lowLevelDesign.parkingLotSystemPracticing.factory.VehicleTypeManagerFactory;
import lowLevelDesign.parkingLotSystemPracticing.data.Ticket;
import lowLevelDesign.parkingLotSystemPracticing.enums.PaymentStatus;
import lowLevelDesign.parkingLotSystemPracticing.vehicleTypeManager.VehicleTypeManager;

public class ExitParkingSpotAPI {
    public boolean exitParkingSpot(Ticket ticket, PaymentMode paymentMode) {
        try {
            Long duration = System.currentTimeMillis() -  ticket.getStartDuration();
            VehicleTypeManager vehicleTypeManager = VehicleTypeManagerFactory
                    .getVehicleTypeManager(ticket.getVehicleType());
            Double paymentAmount = vehicleTypeManager.getParkingFee(duration);

            PaymentManager paymentManager = PaymentManagerFactory.getPaymentManager(paymentMode);
            PaymentStatus paymentStatus = paymentManager.pay(paymentAmount, ticket);
            if(paymentStatus.equals(PaymentStatus.SUCCESS)) {
                ParkingSpotManager parkingSpotManager = new ParkingSpotManager(ticket.getVehicle(), ticket.getVehicleType());
                parkingSpotManager.deAllocateParkingSpot(ticket.getParkingSpot());
                return true;
            }
            else {
                System.out.println("PaymentStatus is :" + paymentStatus);
                return false;
            }
        }
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
