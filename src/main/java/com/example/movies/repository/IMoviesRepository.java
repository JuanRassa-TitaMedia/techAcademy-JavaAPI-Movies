package com.example.movies.repository;

import java.util.List;

import com.example.movies.model.Movie;

public interface IMoviesRepository {
  public List<Movie> getAll();
  public Movie get(String movieId);
  public Movie save(Movie movie);
  public Movie delete(String movieId);
}
