package com.endavacourse.filmpreference.controllers;

import com.endavacourse.filmpreference.model.Movie;
import com.endavacourse.filmpreference.model.MovieRepository;
import com.endavacourse.filmpreference.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieRepository repository;

    @GetMapping
    @RequestMapping("/movies")
    List<Movie> getMovies() {
        return movieService.getAll(repository);
    }
}
