package io.atos.moviecatalogservice.models;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class RatingListTest {

    @Test
    public void validateRatingListTest() {
        Rating r1 = new Rating("source_1", "8");
        String movieTitle = "Titanic";
        RatingList ratingList = new RatingList();
        ratingList.setMovieTitle(movieTitle);
        ratingList.setRatings(new ArrayList<Rating>() {{add(r1);}});

        Assert.assertEquals(movieTitle, ratingList.getMovieTitle());
        Assert.assertNotNull(ratingList.getRatings());
        Assert.assertEquals(r1.getSource(), ratingList.getRatings().get(ratingList.getRatings().size() - 1).getSource());
    }

}
