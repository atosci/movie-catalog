package io.javabrains.moviecatalogservice.resources;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Movie;
import io.javabrains.moviecatalogservice.models.Rating;
import io.javabrains.moviecatalogservice.models.RatingList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CatalogResourceTest {
    private CatalogResource catalogResource;

    @Mock
    CatalogResource catalogResourceMock;

    @Before
    public void init() {
        catalogResource = new CatalogResource();
    }

    @Test
    public void validateGetCatalog() {
        String movieTitle = "Sissi";
        Movie movie = new Movie();
        RatingList ratingList = new RatingList();
        ratingList.setMovieTitle(movieTitle);
        Rating rating1 = new Rating("source news", "8/10");
        ratingList.setRatings(new ArrayList<Rating>(){{add(rating1);}});

        CatalogItem expected = new CatalogItem();
        expected.setRatingList(ratingList);
        expected.setMovie(movie);

        catalogResourceMock = mock(CatalogResource.class);
        when(catalogResourceMock.getCatalog(eq(movieTitle))).thenReturn(expected);

        CatalogItem result = catalogResourceMock.getCatalog(movieTitle);
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getMovie());
        Assert.assertNotNull(result.getRatingList());
        Assert.assertEquals(expected.getRatingList().getRatings().size(), result.getRatingList().getRatings().size());
        Assert.assertEquals(rating1.getSource(), result.getRatingList().getRatings().get(result.getRatingList().getRatings().size() - 1).getSource());
    }

    @Test
    public void invalidGetCatalogParameterLengthZero() {
        CatalogItem result = catalogResource.getCatalog("");

        Assert.assertNotNull(result);
        Assert.assertNull(result.getRatingList());
        Assert.assertNull(result.getMovie());
    }
}
