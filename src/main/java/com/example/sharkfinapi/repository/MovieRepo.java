package com.example.sharkfinapi.repository;

import com.example.sharkfinapi.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MovieRepo extends JpaRepository<Movie, Long> {
}
