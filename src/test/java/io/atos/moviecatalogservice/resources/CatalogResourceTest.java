package io.atos.moviecatalogservice.resources;

import io.atos.moviecatalogservice.models.CatalogItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class CatalogResourceTest {

    @Mock
    CatalogResource catalogResource;

    @Before
    public void init() {
        catalogResource = new CatalogResource();
    }

    @Test
    public void validateGetCatalog() {
        String movieTitle = "Sissi";

    }

    @Test
    public void invalidGetCatalogParameterLengthZero() {
        CatalogItem result = catalogResource.getCatalog("");

        Assert.assertNotNull(result);
        Assert.assertNull(result.getRatingList());
        Assert.assertNull(result.getMovie());
    }
}
