package com.endavacourse.filmpreference.service;

import com.endavacourse.filmpreference.model.Movie;
import com.endavacourse.filmpreference.model.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    public List<Movie> getAll(MovieRepository repository) {
        if (repository.findAll().isEmpty()) {
            repository.save(new Movie("Killer", 1996, 7));
            repository.save(new Movie("Sleep", 1999, 9));
            repository.save(new Movie("Old town road", 1989, 5));
            repository.save(new Movie("Kill Bill", 2001, 10));
        }

        return repository.findAll();
    }
}
