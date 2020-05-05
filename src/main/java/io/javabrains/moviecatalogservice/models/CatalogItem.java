package io.javabrains.moviecatalogservice.models;

public class CatalogItem {
    private Movie movie;
    private RatingList ratingList;

    // empty constructor
    public CatalogItem() {

    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public RatingList getRatingList() {
        return ratingList;
    }

    public void setRatingList(RatingList ratingList) {
        this.ratingList = ratingList;
    }

}
