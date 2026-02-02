package streamApi.movie;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(new Movie("Avengers Dooms Day",10,LocalDate.of(2026, 12, 5)));
		movies.add(new Movie("Golmaal 5",7,LocalDate.of(2026, 5, 14)));
		movies.add(new Movie("Spider-Man Home comming",4.5,LocalDate.of(2027, 8, 25)));
		
		System.out.println("\nSorted By Release Date : ");
		movies.stream().sorted((Movie a, Movie b)->a.release.compareTo(b.release)).forEach(System.out::println);
		
		System.out.println("\nSorted By Rating       : ");
		movies.stream().sorted((Movie a, Movie b)->Double.compare(a.rating,b.rating)).forEach(System.out::println);
	}
}
