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


    @Test
    public void validateMovieSetterTest() {
        Movie movie = new Movie();

        movie.setTitle("Movie");
        movie.setPlot("Plot");
        movie.setDirector("Director");
        movie.setYear("Year");
        movie.setPoster("Poster");
        movie.setGenre("Gerne");
        movie.setActors("Actors");

        Assert.assertEquals("Movie", movie.getTitle());
        Assert.assertEquals("Plot", movie.getPlot());
        Assert.assertEquals("Director", movie.getDirector());
        Assert.assertEquals("Year", movie.getYear());
        Assert.assertEquals("Poster", movie.getPoster());
        Assert.assertEquals("Gerne", movie.getGenre());
        Assert.assertEquals("Actors", movie.getActors());

    }
}
