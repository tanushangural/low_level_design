package lowLevelDesign.movieTicketBookingSystem.booker;

import lowLevelDesign.movieTicketBookingSystem.seat.Seat;
import lowLevelDesign.movieTicketBookingSystem.show.MovieShow;

import java.util.List;
import java.util.concurrent.locks.Lock;

public class Booker {

    public Boolean checkSeatsAvailability(List<Seat> seatList) {
        return false;
    }

    public Boolean temporaryLockingOfSeats(List<Seat> seatList) {
        return true;
    }

    public Double calculateSeatsCost(List<Seat> seatList) {
        Double amount = 0.0;
        for(Seat seat: seatList) {
            amount += seat.getSeatCost();
        }
        return amount;
    }
}
