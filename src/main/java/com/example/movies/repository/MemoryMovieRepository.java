package com.example.movies.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.movies.model.Movie;

@Repository
public class MemoryMovieRepository implements IMoviesRepository {
  private Map<String, Movie> moviesMap;

  MemoryMovieRepository() {
    moviesMap = new HashMap<>();
  }

  @Override
  public List<Movie> getAll() {
    List<Movie> ret = new ArrayList<>();
    ret.addAll(moviesMap.values());
    return ret;
  }

  @Override
  public Movie get(String movieId) {
    return moviesMap.get(movieId);
  }

  @Override
  public Movie save(Movie movie) {
    if (movie.getMovieId() == null) 
    {
      movie.setMovieId(String.valueOf(System.currentTimeMillis()));
    }
    return moviesMap.put(movie.getMovieId(), movie);
  }

  @Override
  public Movie delete(String movieId) {
    return moviesMap.remove(movieId);
  }
  
}
