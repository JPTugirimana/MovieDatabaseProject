package moviedatabase;

public class Movie {
	// Instance variables
	private String name;
	private String[] actorsList;
	double rating;
	
	public Movie(String name, String[] list){
		this.name = name;
		rating = 0;
		actorsList = new String[list.length];
		
		// Assign actors list by copying input list
		for (int i = 0; i<list.length; i++){
			 actorsList[i] = list[i];
		}
	}

	// Name 
	public String getName() {
		return name;
	}

	// Actors
	public String[] getActorsList() {
		return actorsList;
	}

	// Rating
	public double getRating() {
		return rating;
	}

	// Setter for rating is needed because the rating can change overtime
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}
