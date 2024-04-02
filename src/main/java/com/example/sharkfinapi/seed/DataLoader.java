package com.example.sharkfinapi.seed;

import com.example.sharkfinapi.model.Movie;
import com.example.sharkfinapi.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    MovieRepo movieRepo;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }

    void loadUserData() {
        Movie rio = new Movie(1L, "Rio", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie the_jester = new Movie(2L, "The Jester", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie nowhere = new Movie(3L, "Nowhere", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie mama = new Movie(4L, "Mama", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie transformers = new Movie(5L, "Transformers", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie american_assassin = new Movie(6L, "American Assassin", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie scream = new Movie(7L, "Scream", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie scream_two = new Movie(8L, "Scream 2", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie bumblebee = new Movie(9L, "Bumblebee", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie american_sniper = new Movie(10L, "American Sniper", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie tokyo_drift = new Movie(11L, "Fast & Furious: Tokyo Drift", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie ford_v_ferrari = new Movie(12L, "Ford V Ferrari", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie rush = new Movie(13L, "Rush", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie rush_hour = new Movie(14L, "Rush Hour", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie jarhead = new Movie(15L, "Jarhead", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie the_millers = new Movie(16L, "The Millers", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie creed = new Movie(17L, "Creed", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie rocky = new Movie(18L, "Rocky", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie gran_turismo = new Movie(19L, "Gran Turismo", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);
        Movie the_conjuring = new Movie(20L, "The Conjuring", "Comedy", "Edgar Zambrana", new ArrayList<>(), "Production Company", "About this movie...", 4.9, new ArrayList<>(), 2011);

        movieRepo.save(rio);
        movieRepo.save(the_jester);
        movieRepo.save(nowhere);
        movieRepo.save(mama);
        movieRepo.save(transformers);
        movieRepo.save(american_assassin);
        movieRepo.save(scream);
        movieRepo.save(scream_two);
        movieRepo.save(bumblebee);
        movieRepo.save(american_sniper);
        movieRepo.save(tokyo_drift);
        movieRepo.save(ford_v_ferrari);
        movieRepo.save(rush);
        movieRepo.save(rush_hour);
        movieRepo.save(jarhead);
        movieRepo.save(the_millers);
        movieRepo.save(creed);
        movieRepo.save(rocky);
        movieRepo.save(gran_turismo);
        movieRepo.save(the_conjuring);
    }
}
