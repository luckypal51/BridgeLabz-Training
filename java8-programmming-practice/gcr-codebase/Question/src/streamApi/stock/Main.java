package streamApi.stock;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Stock> stock = new ArrayList<>();
		stock.add(new Stock("Amul",1500));
		stock.add(new Stock("Nvidia",4500));
		stock.add(new Stock("ITC",457));
		
		stock.forEach(System.out::println);
	}
}
