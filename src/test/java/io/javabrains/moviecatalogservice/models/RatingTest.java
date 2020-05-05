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

    @Test
    public void validateRatingConstructorWithParameters() {
        String value = "value_001";
        String source = "source_001";
        Rating rating = new Rating(source, value);

        Assert.assertEquals(value, rating.getValue());
        Assert.assertEquals(source, rating.getSource());
    }

}
