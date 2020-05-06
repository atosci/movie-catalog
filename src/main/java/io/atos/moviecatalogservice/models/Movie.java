package io.atos.moviecatalogservice.models;

public class Movie {
    private String Title;
    private String Plot;
    private String Year;
    private String Genre;
    private String Director;
    private String Actors;

    public Movie() { }

    public String getTitle() {
        return Title;
    }

    public String getPlot() {
        return Plot;
    }

    public String getYear() {
        return Year;
    }

    public String getGenre() {
        return Genre;
    }

    public String getDirector() {
        return Director;
    }

    public String getActors() {
        return Actors;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPlot(String plot) {
        Plot = plot;
    }

    public void setYear(String year) {
        Year = year;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public void setActors(String actors) {
        Actors = actors;
    }
}
