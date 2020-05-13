package io.atos.moviecatalogservice.resources;

import com.google.gson.Gson;
import io.atos.moviecatalogservice.models.RatingList;
import io.atos.moviecatalogservice.models.CatalogItem;
import io.atos.moviecatalogservice.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author Mohamed El Kawakibi
 * @author Puck School
 */
@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    WebClient.Builder webClientBuilder;

    /** Gets a CatalogItem representing information about a movie and its ratings
     * @param movieTitle A String representing the title of movie
     * @return A CatalogItem representing all the information about the movie and its ratings
     */
    @GetMapping(path = "/{movieTitle}")
    public CatalogItem getCatalog(@PathVariable("movieTitle") String movieTitle) {
        CatalogItem catalogItem = new CatalogItem();
        RestTemplate restTemplate;

        if (movieTitle.length() > 0 ) {
            restTemplate = new RestTemplate();

            String movieResponse = restTemplate.getForObject("http://movie-info/movies/" + movieTitle, String.class);
            String ratingResponse = restTemplate.getForObject("http://movie-rating/ratingsdata/user/" + movieTitle, String.class);

            Gson gson = new Gson();

            Movie movie = gson.fromJson(movieResponse, Movie.class);
            RatingList ratingList = gson.fromJson(ratingResponse, RatingList.class);

            catalogItem.setMovie(movie);
            catalogItem.setRatingList(ratingList);
        }

        return  catalogItem;
    }
}
