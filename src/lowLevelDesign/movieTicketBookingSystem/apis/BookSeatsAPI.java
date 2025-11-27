package lowLevelDesign.movieTicketBookingSystem.apis;

import lowLevelDesign.movieTicketBookingSystem.Booking;
import lowLevelDesign.movieTicketBookingSystem.User;
import lowLevelDesign.movieTicketBookingSystem.booker.Booker;
import lowLevelDesign.movieTicketBookingSystem.enums.PaymentStatus;
import lowLevelDesign.movieTicketBookingSystem.paymentService.DefaultPaymentService;
import lowLevelDesign.movieTicketBookingSystem.paymentService.PaymentService;
import lowLevelDesign.movieTicketBookingSystem.seat.Seat;
import lowLevelDesign.movieTicketBookingSystem.show.MovieShow;

import java.util.List;

public class BookSeatsAPI {
    public Booking bookSeats(MovieShow movieShow, List<Seat> seatsList, User user) {
        Booker booker = new Booker();
        PaymentService paymentService = new DefaultPaymentService();
        Boolean isAllSeatsAvailable = booker.checkSeatsAvailability(seatsList);
        if(!isAllSeatsAvailable) {
            throw new RuntimeException("All seats are not avl");
        }
        booker.temporaryLockingOfSeats(seatsList);
        Double paymentAmount = booker.calculateSeatsCost(seatsList);
        PaymentStatus paymentStatus = paymentService.pay(paymentAmount, user);
        Booking booking = null;
        if(PaymentStatus.SUCCESS.equals(paymentStatus)) {
            // can be use build pattern here
            booking = new Booking(user, seatsList, paymentAmount, PaymentStatus.SUCCESS , movieShow);
        }
        else {
            booking = new Booking(user, seatsList, paymentAmount, PaymentStatus.FAILED, movieShow);
        }
        return booking;
    }
}

/*
Booking bookSeats(MovieShow, List<Seats> avlSeats)
    Internal this apis will be doing
    a. verify seats are avl
    b. if all seats avl lock them
    c. calculateAmount
    d. payAmountUsing PaymentService
    e. Generate Booking
    f return Booking
* */
