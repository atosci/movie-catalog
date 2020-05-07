package io.atos.moviecatalogservice.resources;

import com.google.gson.Gson;
import io.atos.moviecatalogservice.models.CatalogItem;
import io.atos.moviecatalogservice.models.Movie;
import io.atos.moviecatalogservice.models.RatingList;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CatalogControllerTest {

    @Test
    public void indexTest(){

        RestTemplate restTemplate = new RestTemplate();
        String expected = "{\"Title\":\"Drive\",\"Plot\":\"A mysterious Hollywood stuntman and mechanic moonlights as a getaway driver and finds himself in trouble when he helps out his neighbor in this action drama.\",\"Year\":\"2011\",\"Genre\":\"Crime, Drama\",\"Director\":\"Nicolas Winding Refn\",\"Actors\":\"Ryan Gosling, Carey Mulligan, Bryan Cranston, Albert Brooks\",\"Poster\":\"https://m.media-amazon.com/images/M/MV5BZjY5ZjQyMjMtMmEwOC00Nzc2LTllYTItMmU2MzJjNTg1NjY0XkEyXkFqcGdeQXVyNjQ1MTMzMDQ@._V1_SX300.jpg\"}";

        String result = restTemplate.getForObject("http://www.omdbapi.com/?t=Drive&apikey=cc323c12", String.class);

        Gson gson = new Gson();

        Movie movie = gson.fromJson(result, Movie.class);
        RatingList ratingList = gson.fromJson(result, RatingList.class);

        CatalogItem catalogItem = new CatalogItem();

        catalogItem.setMovie(movie);
        catalogItem.setRatingList(ratingList);

        Movie movieExpected = gson.fromJson(expected, Movie.class);

        assertEquals(movieExpected.getTitle(), catalogItem.getMovie().getTitle());
        assertEquals(movieExpected.getPlot(), catalogItem.getMovie().getPlot());
        assertEquals(movieExpected.getGenre(), catalogItem.getMovie().getGenre());
        assertEquals(movieExpected.getDirector(), catalogItem.getMovie().getDirector());
        assertEquals(movieExpected.getYear(), catalogItem.getMovie().getYear());
        assertEquals(movieExpected.getActors(), catalogItem.getMovie().getActors());

    }

}
