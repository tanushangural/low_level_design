package lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.apis;

import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.ParkingSpot;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.Ticket;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.data.Vehicle;
import lowLevelDesign.LibraryManagementSystem.ParkingLotSystem.ticket.TickerGenerator;

public class GetTicketAPI {
    public Ticket getTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        return new TickerGenerator().generateTicker(vehicle, parkingSpot);
    }
}
