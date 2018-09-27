package moviedatabase;
import java.util.ArrayList;


public class Actor {

	// Instance Variables
	private String name;
	private ArrayList<Movie> movies;
	
	public Actor(String name, ArrayList<Movie> list){
		this.name = name;
		movies = new ArrayList<Movie>(list);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public void setMovies(ArrayList<Movie> movies) {
		this.movies = movies;
	}
	
	
}
