package io.javabrains.moviecatalogservice.resources;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import org.junit.Rule;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Movie;
import io.javabrains.moviecatalogservice.models.RatingList;
import io.javabrains.moviecatalogservice.models.Rating;


class CatalogResourceTest {
	
	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	@Test
	void testGetCatalog() {
		CatalogItem expected = new CatalogItem();
		String movieTitle1 = "Titanic";

		CatalogResource catalogResource = new CatalogResource();

		RatingList ratingListResult = new RatingList();
		ratingListResult.setMovieTitle(movieTitle1);
		ratingListResult.setRatings(new ArrayList<Rating>() {{
			add(new Rating("Internet Movie Database", "7.8/10"));
			add(new Rating("Rotten Tomatoes", "89%"));
			add(new Rating("Metacritic", "75/100"));
		}});

		Movie movieResult = new Movie();

		expected.setRatingList(ratingListResult);
		expected.setMovie(movieResult);

		CatalogItem result = catalogResource.getCatalog(movieTitle1);

		Assert.assertEquals(expected.getRatingList().getMovieTitle(), ratingListResult.getMovieTitle());


	}


}
