package moviedatabase;

import java.util.ArrayList;

public class MovieDatabase {
	// Instance variables
	ArrayList<Movie> movies;
	ArrayList<Actor> actors;
	
	public MovieDatabase(){
		// Empty lists
		movies = new ArrayList<Movie>();
		actors = new ArrayList<Actor>();
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public ArrayList<Actor> getActors() {
		return actors;
	}

	public void AddMovie(String name, String[] actorslist){
		// check if movie is in database already, ignore
		
		// if movie is new, add to database
		
		// go through actors. Add new actors to actors database
		
	}
	
	public void AddRating(String Name, double rating){
		// go through database to find the movie then set the rating
	}
	
	public void UpdateRating(String Name, double rating){
		// go through database to find the movie then set the rating
	}
	
	public String BestActor(){
		// go through the actors database, 
		// for each actor go through their movies and average their rating
		String actorName = "empty";
		
		return actorName;
	}
	
	public String BestMovie(){
		// go through the movie database, 
		// for each movie, compare rating to current highest
		// if currentHighest > highest, set new highest
		String movieName = "empty";
		double highestRating = 0;
		
		return movieName;
	}
	
	// Create new MovieDatabase object 
    // create 3 random array (string) of random actors since no actors in the provided movie file
	// read from movies file and add each one to movie class with random array of actors
	
	// read ratings file 
	// add movie and set rating
	
	// DISPLAY bestActor
	// DISPLAY bestMovie
	
}
