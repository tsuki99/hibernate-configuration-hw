package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        movieService.add(new Movie("Iron man 2", "rich person with high iq.."));
        movieService.add(new Movie("Spider-man", "smart student got spider bite.."));

        System.out.println(movieService.get(1L));
    }
}
