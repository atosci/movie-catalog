package io.javabrains.moviecatalogservice.resources;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import org.junit.Test;
import org.mockito.Mock;

public class CatalogResourceTest {

    @Mock
    CatalogResource catalogResource;

    @Test
    public void GetCatalog() {
        catalogResource = new CatalogResource();
        String movieTitle = "Sissi";


        CatalogItem result = catalogResource.getCatalog(movieTitle);

    }
}
