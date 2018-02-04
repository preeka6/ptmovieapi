package com.app;

public interface IMovieService {

	   public Iterable<Movie> listAllMovies();

	   public Movie getMovieById(long id1);

	   public Movie saveMovie(Movie movie);
	    
	   public void deleteMovie(long id1);
	
}
