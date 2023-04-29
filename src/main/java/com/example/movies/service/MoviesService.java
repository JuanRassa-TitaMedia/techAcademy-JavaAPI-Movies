package com.example.movies.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.movies.model.Movie;
import com.example.movies.repository.IMoviesRepository;

@Service
public class MoviesService {
  private final IMoviesRepository moviesRepository;

  public MoviesService(IMoviesRepository moviesRepository) {
    this.moviesRepository = moviesRepository;
  }
  
  public List<Movie> getAll() 
  {
    return moviesRepository.getAll();
  }

  public Movie get(String movieId) 
  {
    return moviesRepository.get(movieId);
  }

  public Movie addMovie(Movie movie) 
  {
    movie.setMovieId(null);
    return moviesRepository.save(movie);
  }

  public Movie updateMovie(String movieId, Movie movie) 
  {
    Movie movieR = moviesRepository.get(movieId);
    if(movieR == null) 
    {
      return null;
    } 
    movie.setMovieId(movieId);
    return moviesRepository.save(movie);
  }

  public Movie deleteMovie(String movieId) 
  {
    return moviesRepository.delete(movieId);
  }
}
