package com.example.sharkfinapi.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private String genre;

    @Column
    private String director;

    @Column
    private ArrayList<String> movieCast;

    @Column
    private String productionCompany;

    @Column
    private String about;

    @Column
    private double rating;

    @Column
    private ArrayList<String> hosted;

    @Column
    private int releaseYear;

    public Movie() {
    }

    public Movie(long id, String title, String genre, String director, ArrayList<String> movieCast, String productionCompany, String about, double rating, ArrayList<String> hosted, int releaseYear) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.movieCast = movieCast;
        this.productionCompany = productionCompany;
        this.about = about;
        this.rating = rating;
        this.hosted = hosted;
        this.releaseYear = releaseYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getMovieCast() {
        return movieCast;
    }

    public void setMovieCast(ArrayList<String> movieCast) {
        this.movieCast = movieCast;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getHosted() {
        return hosted;
    }

    public void setHosted(ArrayList<String> hosted) {
        this.hosted = hosted;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", movieCast=" + movieCast +
                ", productionCompany='" + productionCompany + '\'' +
                ", about='" + about + '\'' +
                ", rating=" + rating +
                ", hosted=" + hosted + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
