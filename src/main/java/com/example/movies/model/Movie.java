package com.example.movies.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Movie {
  private String movieId;
  private String title;
  private String description;
  private String director;
  public Movie(String title, String description, String director) {
    this.title = title;
    this.description = description;
    this.director = director;
  }

  
}
