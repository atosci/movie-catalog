package io.atos.moviecatalogservice.models;

import org.junit.Assert;
import org.junit.Test;

public class CatalogItemTest {

    @Test
    public void validateCatalogItemTest() {
        CatalogItem catalogItem = new CatalogItem();
        Movie movie = new Movie();
        RatingList ratingList = new RatingList();

        catalogItem.setMovie(movie);
        catalogItem.setRatingList(ratingList);
        Assert.assertNotNull(catalogItem);
        Assert.assertNotNull(catalogItem.getMovie());
        Assert.assertNotNull(catalogItem.getRatingList());
    }

}
