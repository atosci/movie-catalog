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

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    WebClient.Builder webClientBuilder;

    @GetMapping(path = "/{movieTitle}")
    public CatalogItem getCatalog(@PathVariable("movieTitle") String movieTitle) {
        CatalogItem catalogItem = new CatalogItem();
        RestTemplate restTemplate;

        if (movieTitle.length() > 0 ) {
            restTemplate = new RestTemplate();

            //TODO change url to remote url
            String movieResponse = restTemplate.getForObject("http://localhost:8080/movies/" + movieTitle, String.class);
            String ratingResponse = restTemplate.getForObject("http://localhost:8081/ratingsdata/user/" + movieTitle, String.class);

            Gson gson = new Gson();

            Movie movie = gson.fromJson(movieResponse, Movie.class);
            RatingList ratingList = gson.fromJson(ratingResponse, RatingList.class);

            catalogItem.setMovie(movie);
            catalogItem.setRatingList(ratingList);
        }

        return  catalogItem;
    }
}
