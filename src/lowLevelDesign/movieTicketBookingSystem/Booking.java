package lowLevelDesign.movieTicketBookingSystem;

import lowLevelDesign.movieTicketBookingSystem.enums.PaymentStatus;
import lowLevelDesign.movieTicketBookingSystem.seat.Seat;
import lowLevelDesign.movieTicketBookingSystem.show.MovieShow;

import java.util.List;
import java.util.Random;

public class Booking {
    // Booking should have : UserDetails(Id), the Show, seats, amount, status (CONFIRMED,CANCELLED, FAILED)

    private final Integer bookingId;
    private final User user;
    private final List<Seat> seatList;
    private final Double amount;
    private final PaymentStatus paymentStatus;
    private final MovieShow movieShow;

    public Booking(User user, List<Seat> seatList, Double amount, PaymentStatus paymentStatus, MovieShow movieShow) {
        this.amount = amount;
        this.paymentStatus = paymentStatus;
        this.user = user;
        this.seatList = seatList;
        Random random = new Random();
        this.bookingId = random.nextInt();
        this.movieShow = movieShow;
    }
}
