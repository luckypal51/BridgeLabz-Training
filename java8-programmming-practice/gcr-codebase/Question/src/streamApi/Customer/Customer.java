package streamApi.Customer;

import java.util.ArrayList;

public class Customer {
     public static void main(String[] args) {
		ArrayList<String> customers = new ArrayList<>();
		customers.add("Lucky");
		customers.add("Himesh");
		customers.add("Nageshwar");
		customers.add("arvind");
		
		customers.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	}
}
