package com.example.sharkfinapi.service;

import com.example.sharkfinapi.model.Movie;
import com.example.sharkfinapi.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private MovieRepo movieRepo;

    @Autowired
    public void setMovieRepo(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }
}
