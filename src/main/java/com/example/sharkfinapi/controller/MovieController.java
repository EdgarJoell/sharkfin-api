package com.example.sharkfinapi.controller;

import com.example.sharkfinapi.model.Movie;
import com.example.sharkfinapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping(path = "/api/movies/")
public class MovieController {
    private MovieService movieService;

    @Autowired
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping(path = "/all-movies/")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping(path = "/search/{titleSearch}/")
    public Stream<Movie> searchForGroupOfMovies(@PathVariable String titleSearch) {
        return movieService.searchForGroupOfMovies(titleSearch);
    }
}
