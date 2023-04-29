package com.example.movies.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.movies.model.Movie;
import com.example.movies.service.MoviesService;

@Component
public class MovieFiller {
  private final MoviesService moviesService;
  
  public MovieFiller(MoviesService moviesService) {
    this.moviesService = moviesService;
  }

  @PostConstruct
  public void init() 
    {
      Movie movie1 = new Movie("Tár", 
        "I haven't seen it.", "I don't know");
      moviesService.addMovie(movie1);
      try {Thread.sleep(1000);} catch (InterruptedException e) {}
      Movie movie2 = new Movie("Toy Story", 
      "5 stars.", "John Lennon");
      moviesService.addMovie(movie2);
      try {Thread.sleep(1000);} catch (InterruptedException e) {}
      Movie movie3 = new Movie("The Shawshank Redemption", 
      "Great.", "Kilo Kan");
      moviesService.addMovie(movie3);
      try {Thread.sleep(1000);} catch (InterruptedException e) {}
      Movie movie4 = new Movie("The Godfather", 
        "Damn!", "A Great One");
      moviesService.addMovie(movie4);
    }
}
