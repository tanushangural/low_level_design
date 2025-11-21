package lowLevelDesign.ParkingLotSystem.apis;

import lowLevelDesign.ParkingLotSystem.data.ParkingSpot;
import lowLevelDesign.ParkingLotSystem.data.Ticket;
import lowLevelDesign.ParkingLotSystem.data.Vehicle;
import lowLevelDesign.ParkingLotSystem.ticket.TickerGenerator;

public class GetTicketAPI {
    public Ticket getTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        return new TickerGenerator().generateTicker(vehicle, parkingSpot);
    }
}
