package collectors.book;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("Comedy","Golmaal","Rohit Shetty",1500));
		books.add(new Book("Action","Dabang","Salam Khan",450));
		books.add(new Book("Comedy","Hulchul","Paresh rawal",120));
		
		HashMap<String,IntSummaryStatistics> map = (HashMap<String,IntSummaryStatistics>)books.stream().collect(Collectors.groupingBy(s->s.genre,Collectors.summarizingInt(s->s.page)));
		for(var a: map.entrySet()) {
			System.out.println("\nGenre   : "+a.getKey());
			System.out.println("Average : "+a.getValue().getAverage());
			System.out.println("Sum     : "+a.getValue().getSum());
			System.out.println("Count   : "+a.getValue().getSum());
		}
	}
}
