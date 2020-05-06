package io.atos.moviecatalogservice.models;

import org.junit.Assert;
import org.junit.Test;

public class MovieTest {

    @Test
    public void validateMovieGetterTest() {
        Movie movie = new Movie();

        Assert.assertNull(movie.getYear());
        Assert.assertNull(movie.getTitle());
        Assert.assertNull(movie.getPlot());
        Assert.assertNull(movie.getGenre());
        Assert.assertNull(movie.getDirector());
        Assert.assertNull(movie.getActors());

    }
}
