package io.javabrains.moviecatalogservice.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;

public class RatingTest {

    @Test
    public void validateRatingGetterSetterTest() {
        Rating rating = new Rating();

        String expected = "source: red apple";
        rating.setSource(expected);
        Assert.assertEquals(expected, rating.getSource());

        expected = "9/10";
        rating.setValue(expected);
        Assert.assertEquals(expected, rating.getValue());
    }

}
