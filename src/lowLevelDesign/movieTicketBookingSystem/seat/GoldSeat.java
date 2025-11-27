package lowLevelDesign.movieTicketBookingSystem.seat;

import lowLevelDesign.movieTicketBookingSystem.enums.SeatType;

public class GoldSeat implements Seat{
    @Override
    public Double getSeatCost() {
        return 200.0;
    }
}
