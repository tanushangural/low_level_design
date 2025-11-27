package lowLevelDesign.movieTicketBookingSystem;

public class Main {
    public static void main(String[] args) {

    }
}


/*
APIS

1. List<MovieShow> getMovieShowsByDate(Date date);
2. List<MovieShow> getMovieShowsByCity(String city);
3. List<MovieShow> getMovieShowsByMovieName(String name)

4. Booking bookSeats(MovieShow, List<Seats> avlSeats)
    Internal this apis will be doing
    a. verify seats are avl
    b. if all seats avl lock them
    c. calculateAmount
    d. payAmountUsing PaymentService
    e. Generate Booking
    f return Booking

5. List<Booking> searchBookingByUser(User user);
* */



/*
Requirements

1. there will mutiple cities,
each city can have multiple theates,
each theatres can have multiple screens
each screen can have mutiple show interview wise lets say there are three intervals( morning, noon and night)

2. Movie has startTime, endTime, language, ( here 2D, 3D, IMAX screen can be depend on theatres)
Seat can be define row,col in threatre
Seat categories GOLD/SILVER
There will be Screen Types: 2D,3D,IMAX with a capacity

3. USER can search movies, by date, city, and movieName
   for each search option user can see the seats of theatres with status AVAILABLE, BOOKED, TEMPORARILY_LOCKED

4. User can book more than 1 ticket at once in one theatre

5. Steps for user ticket booking will be, select avl sheets -> TEMPORARILY_LOCKED the selected sheets -> initate payment, if success -> BOOKED, else make seats back to AVAILABLE

6. Booking should have : UserDetails(Id), the Show, seats, amount, status (CONFIRMED,CANCELLED, FAILED)

7. Assume integration with an external payment provider (like a PaymentService). Payment can succeed or fail.
On success → confirm booking, mark seats as booked.
On failure → release seats and mark booking accordingly.


8. USER can search past bookings and upcoming bookings

* */

