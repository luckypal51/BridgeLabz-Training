package collectors.revenue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		ArrayList<Order> orders = new ArrayList<>();
		
		orders.add(new Order("Lucky","Smartphone",4500000));
		orders.add(new Order("Himesh","Aloo",1500));
		orders.add(new Order("Lucky","Tv",25000));
		Map<String, Double> map =
			    orders.stream()
			          .collect(Collectors.groupingBy(
			              s -> s.customerName,
			              Collectors.summingDouble(s -> s.price)
			          ));
		for(var a : map.entrySet()) {
			System.out.println(a.getKey()+" Total Price "+a.getValue());
		}
	}
}
