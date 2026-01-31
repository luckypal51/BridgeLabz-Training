package lamda.sale;

import java.util.*;

public class Main {
	 public static void main(String[] args) {
		ArrayList<Product> product = new ArrayList<>();
	   product.add(new Product(105,48,10));
	   product.add(new Product(103,100,45));
	   product.add(new Product(104,10,50));
	   
	   System.out.println("Sorted By Id      :");
	   product.stream().sorted((Product a, Product b )->Integer.compare(a.id, b.id)).forEach(System.out::println);
	   
	   System.out.println("\nSorted By Price   :");
	   product.stream().sorted((Product a, Product b)->Double.compare(a.price, b.price)).forEach(System.out::println);
	   
	   System.out.println("\nSorted By Discount:");
	   product.stream().sorted((Product a, Product b)->Double.compare(a.discount, b.discount)).forEach(System.out::println);
	}
}
