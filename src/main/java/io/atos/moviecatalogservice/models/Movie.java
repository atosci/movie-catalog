package io.atos.moviecatalogservice.models;

/**
 * @author Mohamed El Kawakibi
 * @author Puck School
 */
public class Movie {
    private String Title;
    private String Plot;
    private String Year;
    private String Genre;
    private String Director;
    private String Actors;
    private String Poster;

    public Movie() { }

    /** Gets the title of the movie
     * @return A String representing the movie title
     */
    public String getTitle() {
        return Title;
    }

    /** Gets the plot description of the movie
     * @return A String representing the movie plot
     */
    public String getPlot() {
        return Plot;
    }

    /** Gets the poster url of the movie
     * @return A String representing the movie poster url
     */
    public String getPoster() {
        return Poster;
    }

    /** Gets the publish year of the movie
     * @return A String representing the publish year of the movie
     */
    public String getYear() {
        return Year;
    }

    /** Gets the genre of the movie
     * @return A String representing the movie genre
     */
    public String getGenre() {
        return Genre;
    }

    /** Gets the director of the movie
     * @return A String representing the movie director
     */
    public String getDirector() {
        return Director;
    }

    /** Gets the actors of the movie
     * @return A String representing all the movie actors
     */
    public String getActors() {
        return Actors;
    }

    /** Sets the title of the movie
     * @param title A String representing the movie title
     */
    public void setTitle(String title) {
        Title = title;
    }

    /** Sets the plot description for a movie
     * @param plot A String representing the movie plot
     */
    public void setPlot(String plot) {
        Plot = plot;
    }

    /** Sets the publish year of the movie
     * @param year A String representing the publish year of the movie
     */
    public void setYear(String year) {
        Year = year;
    }

    /** Sets the genre of the movie
     * @param genre A String representing the movie genre
     */
    public void setGenre(String genre) {
        Genre = genre;
    }

    /** Sets the director of the movie
     * @param director A String representing the movie director
     */
    public void setDirector(String director) {
        Director = director;
    }

    /** Sets all the actors of the movie in one String
     * @param actors A String representing all the actors of the movie
     */
    public void setActors(String actors) {
        Actors = actors;
    }

    /** Sets the poster url of the movie
     * @param poster A String representing the movie poster url
     */
    public void setPoster(String poster) {
        Poster = poster;
    }
}
