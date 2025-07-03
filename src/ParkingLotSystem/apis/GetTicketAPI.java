package ParkingLotSystem.apis;

import ParkingLotSystem.data.ParkingSpot;
import ParkingLotSystem.data.Ticket;
import ParkingLotSystem.data.Vehicle;
import ParkingLotSystem.data.VehicleType;
import ParkingLotSystem.ticket.TickerGenerator;

public class GetTicketAPI {
    public Ticket getTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        return new TickerGenerator().generateTicker(vehicle, parkingSpot);
    }
}
