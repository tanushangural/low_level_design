package lowLevelDesign.movieTicketBookingSystem;

import lowLevelDesign.movieTicketBookingSystem.show.MovieShow;

import java.util.List;

public class BookingManager {
    private List<MovieShow> movieShowList;
    private static BookingManager INSTANCE;

    private BookingManager() {}

    public BookingManager getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new BookingManager();
        }
        return INSTANCE;
    }
}
