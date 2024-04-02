package com.example.sharkfinapi.controller;

import com.example.sharkfinapi.model.Movie;
import com.example.sharkfinapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
