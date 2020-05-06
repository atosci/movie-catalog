package io.javabrains.moviecatalogservice.resources;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Movie;
import io.javabrains.moviecatalogservice.models.RatingList;
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

        if (movieTitle.length() != 0 ) {
            restTemplate = new RestTemplate();
            catalogItem.setMovie(restTemplate.getForObject("http://movie-info/movies/" + movieTitle, Movie.class));
            catalogItem.setRatingList(restTemplate.getForObject("http://movie-rating/ratingsdata/user/" + movieTitle, RatingList.class));
        }

        return  catalogItem;
    }
}
