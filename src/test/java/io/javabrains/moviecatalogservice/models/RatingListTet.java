package io.javabrains.moviecatalogservice.models;

import org.junit.Test;

import java.util.List;

public class RatingListTet {

    @Test
    public void testRatingListGetterSetter() {
        RatingList ratingList = new RatingList();
        Rating rating1 = new Rating();
        rating1.setValue("test");
        rating1.setSource("new york times");

    }
}
