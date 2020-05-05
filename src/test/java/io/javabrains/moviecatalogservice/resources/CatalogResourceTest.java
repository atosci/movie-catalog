package io.javabrains.moviecatalogservice.resources;

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.Gson;
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
		/*CatalogItem expected = new CatalogItem();
		String movieTitle1 = "Titanic";

		CatalogResource catalogResource = new CatalogResource();

		RatingList ratingListResult = new RatingList();
		ratingListResult.setMovieTitle(movieTitle1);
		ratingListResult.setRatings(new ArrayList<Rating>() {{
			add(new Rating("Internet Movie Database", "7.8/10"));
			add(new Rating("Rotten Tomatoes", "89%"));
			add(new Rating("Metacritic", "75/100"));
		}});

		String movieExpected =  "{\"Title\":\"Titanic\",\"Plot\":\"A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.\",\"Year\":\"1997\",\"Genre\":\"Drama, Romance\",\"Director\":\"James Cameron\",\"Actors\":\"Leonardo DiCaprio, Kate Winslet, Billy Zane, Kathy Bates\"}";
		Gson gson = new Gson();
		Movie movieResult = gson.fromJson(movieExpected, Movie.class);


		expected.setRatingList(ratingListResult);
		expected.setMovie(movieResult);

		CatalogItem result = catalogResource.getCatalog(movieTitle1);

		Assert.assertEquals(expected.getRatingList().getMovieTitle(), ratingListResult.getMovieTitle());
		Assert.assertEquals(movieResult.getActors(), result.getMovie().getActors());
		Assert.assertEquals(movieResult.getDirector(), result.getMovie().getDirector());
		Assert.assertEquals(movieResult.getGenre(), result.getMovie().getGenre());
		Assert.assertEquals(movieResult.getPlot(), result.getMovie().getPlot());
		Assert.assertEquals(movieResult.getTitle(), result.getMovie().getTitle());
		Assert.assertEquals(movieResult.getYear(), result.getMovie().getYear());*/
	}


}
