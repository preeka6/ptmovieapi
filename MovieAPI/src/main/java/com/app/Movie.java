package com.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity							
public class Movie {	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private long id;
	private String title;
	private String director;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Movie() {
		super();
	}
	public Movie( long id, String title, String director) {
		super();
		
		this.id = id;
		this.title = title;
		this.director = director;
	}
	
	
}
