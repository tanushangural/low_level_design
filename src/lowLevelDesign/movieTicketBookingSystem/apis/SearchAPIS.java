package lowLevelDesign.movieTicketBookingSystem.apis;

import lowLevelDesign.movieTicketBookingSystem.Searcher.MovieSearcher;
import lowLevelDesign.movieTicketBookingSystem.show.MovieShow;

import java.util.Date;
import java.util.List;

public class SearchAPIS {
    public List<MovieShow> getMovieShowsByDate(Date date) {
        return new MovieSearcher().getShowsByDate(date);
    }

    public List<MovieShow> getMovieShowsByCity(String city) {
        return new MovieSearcher().getShowsByCity(city);
    }

    public List<MovieShow> getMovieShowsByMovieName(String movieName) {
        return new MovieSearcher().getShowsByMovieName(movieName);
    }
}

/*
1. List<MovieShow> getMovieShowsByDate(Date date);
2. List<MovieShow> getMovieShowsByCity(String city);
3. List<MovieShow> getMovieShowsByMovieName(String name)
* */
