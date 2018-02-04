package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements IMovieService{

	private IMovie movieRepo;
	
	@Autowired
	public void setMovieRepo(IMovie movieRepo) {
		this.movieRepo = movieRepo;
	}

	@Override
	public Iterable<Movie> listAllMovies() {
		return movieRepo.findAll();
	}

	@Override
	public Movie getMovieById(long id1) {
		return movieRepo.findOne(id1);
	}

	@Override
	public Movie saveMovie(Movie movie) {
		return movieRepo.save(movie);
	}
	
	@Override
	public void deleteMovie(long id1) {
		
		 movieRepo.delete(id1);
		
	}

	
}
