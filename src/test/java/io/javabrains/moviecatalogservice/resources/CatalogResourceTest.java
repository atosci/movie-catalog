package io.javabrains.moviecatalogservice.resources;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Movie;
import io.javabrains.moviecatalogservice.models.UserRating;
import io.javabrains.moviecatalogservice.models.Rating;


class CatalogResourceTest {
	
	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	
	CatalogResource catalog = Mockito.mock(CatalogResource.class);
	String userId = "1";
	
	@Test
	void testGetCatalog() {
		List<CatalogItem> expected = getListRating();
		
		when(catalog.getCatalog(eq(userId)))
		.thenReturn(getListRating());
		
		
		assertEquals(expected.get(0).getName(), getListRating().get(0).getName());
		
		assertEquals(expected.get(0).getRating(), getListRating().get(0).getRating());
	}
	
	public List<CatalogItem> getListRating() {
		
		UserRating userRating = new UserRating();
		

		userRating.setRatings(Arrays.asList(
                new Rating("1", 3),
                new Rating("2", 4)
        ));
	        
		 return userRating.getRatings().stream()
	                .map(rating -> {
	                	Movie movie = new Movie("1", "movie title", "movie description");
	                    return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
	                })
	                .collect(Collectors.toList());
	}


}
