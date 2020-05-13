package io.atos.moviecatalogservice.models;

/**
 * @author Mohamed El Kawakibi
 * @author Puck School
 */
public class CatalogItem {
    private Movie movie;
    private RatingList ratingList;

    // empty constructor
    public CatalogItem() {
    }

    /** Gets the Movie information of the CatalogItem
     * @return A Movie representing the movie information
     */
    public Movie getMovie() {
        return movie;
    }

    /** Sets the Movie information of the CatalogItem
     * @param movie A Movie representing the movie information
     */
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    /** Gets the List of Ratings of the CatalogItem
     * @return A List of Ratings representing the ratings given for the movie
     */
    public RatingList getRatingList() {
        return ratingList;
    }

    /** Sets the List of Ratings of the CatalogItem
     * @param ratingList A List of Ratings representing the ratings given for the movie
     */
    public void setRatingList(RatingList ratingList) {
        this.ratingList = ratingList;
    }

}
