package streamApi.movie;

import java.time.LocalDate;

public class Movie {
     public String name;
     public double rating;
     public LocalDate release;
	
     public Movie(String name, double rating, LocalDate release) {
		super();
		this.name = name;
		this.rating = rating;
		this.release = release;
	 }

	 @Override
	 public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", release=" + release + "]";
	 }
     
     
     
}
