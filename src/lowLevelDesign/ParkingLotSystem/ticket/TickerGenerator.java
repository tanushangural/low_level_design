package lowLevelDesign.ParkingLotSystem.ticket;

import lowLevelDesign.ParkingLotSystem.data.ParkingSpot;
import lowLevelDesign.ParkingLotSystem.data.Ticket;
import lowLevelDesign.ParkingLotSystem.data.Vehicle;

public class TickerGenerator {
    public Ticket generateTicker(Vehicle vehicle, ParkingSpot parkingSpot) {
        String ticketRef = getUniqueTicketRef();
        // logic to check if isFree and then park and persist in database and race conditions etc
        return new Ticket(
                ticketRef,
                vehicle,
                parkingSpot
        );
    }

    private String getUniqueTicketRef() {
        return "";
    }
}
