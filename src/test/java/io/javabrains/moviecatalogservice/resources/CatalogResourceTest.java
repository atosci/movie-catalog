package io.javabrains.moviecatalogservice.resources;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Rule;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

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
	
	
	CatalogResource catalog = Mockito.mock(CatalogResource.class);
	String userId = "1";
	
	@Test
	void testGetCatalog() {
		CatalogItem catalogItem = new CatalogItem();

	}


}
