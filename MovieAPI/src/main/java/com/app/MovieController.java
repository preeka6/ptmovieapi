package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class MovieController {

	
	private IMovieService movieService;
	
	@Autowired
	public void setMovieService(IMovieService movieService) {
		this.movieService = movieService;
	}
	
	@RequestMapping(value="", method=RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        model.addObject("list", movieService.listAllMovies());
        return model;
    }
	
	@RequestMapping(value = "/{id1}/delete", method = RequestMethod.GET)
	    public ModelAndView deleteMovies(@PathVariable long id1) {
		movieService.deleteMovie(id1);
	        return new ModelAndView("redirect:/index");
	    }
	   
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public ModelAndView addMovie(@ModelAttribute("movie")Movie movie){
    	ModelAndView model = new ModelAndView("index");
    	if(movie!=null){
    	movieService.saveMovie(movie);
    	model.addObject("warning", "Movie Successfully Added");
    	
    	}
    	else{
    		model.addObject("danger","Something Going Bad" );
    		
    	}
    	return new ModelAndView("redirect:/index");
    }
    	  @RequestMapping(value = "/{id1}/edit", method = RequestMethod.GET)
    	    public ModelAndView edit(@PathVariable("id1") long id1) {
    		  ModelAndView model = new ModelAndView("edit");
    	        Movie movie = movieService.getMovieById(id1);
    	        model.addObject("movie", movie);
    	        return model;
    	    }
    	  
    	   @RequestMapping(value = "/update", method = RequestMethod.POST)
    	    public ModelAndView update(@RequestParam("id1") long id1,
    	                               @RequestParam("id") long id,@RequestParam("title") String title,
    	    						   @RequestParam("director") String director) {
    	        Movie movie = movieService.getMovieById(id1);
    	        movie.setId(id);
    	        movie.setTitle(title);
    	        movie.setDirector(director);
    	        movieService.saveMovie(movie);
    	        return new ModelAndView("redirect:/index");
    	    }
   
}
