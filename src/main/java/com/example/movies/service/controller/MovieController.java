package com.example.movies.service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movies.model.Movie;
import com.example.movies.service.MoviesService;

@RestController
@RequestMapping({"/movie"})
public class MovieController {
  private final MoviesService moviesService;

  public MovieController(MoviesService moviesService) {
    this.moviesService = moviesService;
  }

  @GetMapping("")
  public List<Movie> getAll() 
  {
    return moviesService.getAll();
  }

  @GetMapping("/{movieId}")
  public Movie get(@PathVariable String movieId) 
  {
    return moviesService.get(movieId);
  }

  @PostMapping("")
  public Movie addMovie(@RequestBody Movie movie) 
  {
    return moviesService.addMovie(movie);
  }
  
  @PutMapping("/{movieId}")
  public Movie updateMovie(@PathVariable String movieId, @RequestBody Movie movie) 
  {
    return moviesService.updateMovie(movieId, movie);
  }

  @DeleteMapping("/{movieId}")
  public Movie deleteMovie(@PathVariable String movieId) 
  {
    return moviesService.deleteMovie(movieId);
  }
}
