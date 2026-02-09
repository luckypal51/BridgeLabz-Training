package conversion.mapTolist;

import java.util.*;

public class MapToList {
     public static void main(String[] args) {
    	 
    	//Convert Map to List
		HashMap<Integer,String> map = new HashMap<>();
		map.put(102,"Lucky");
		map.put(101,"Himesh");
		map.put(103,"Nageshwar");
		
		List<Map.Entry<Integer, String>> list = map.entrySet().stream().toList();
		list.forEach(System.out::println);
		System.out.println("\n");
		
		
		//Convert keyset to list
		List<Integer>  list1 = map.entrySet().stream().map(s->s.getKey()).toList();
		System.out.println(list1);
		System.out.println("\n");
		
		//Convert Value To List
		List<String> list2 = map.entrySet().stream().map(s->s.getValue()).toList();
		System.out.println(list2);
		System.out.println("\n");
		
		//Convert Map To Key-Value List
		List<String> list3 = map.entrySet().stream().map(s->s.getKey()+" = "+s.getValue()).toList();
		System.out.println(list3);
		System.out.println("\n");
		
		//Convert Map to Custom Object List
		Random rm = new Random();
		List<Employee> list4 = map.entrySet().stream().map(s->new Employee(s.getKey(),s.getValue(),rm.nextDouble(150000))).toList();
		System.out.println(list4);
		
		//Convert keyset to sorted list 
		List<Integer>  list5 = map.entrySet().stream().map(s->s.getKey()).sorted((a,b)->Integer.compare(a, b)).toList();
		System.out.println(list5);
		System.out.println("\n");
		
		//Convert Value to sorted List
		List<String> list6 = map.entrySet().stream().map(s->s.getValue()).sorted((a,b)->a.compareTo(b)).toList();
		System.out.println(list6);
		System.out.println("\n");
		
		//Convert Map to List and filter by value > N
		List<Map.Entry<Integer, String>> list7 = map.entrySet().stream().filter(s->s.getKey()>101).toList();
		System.out.println(list7);
		System.out.println("\n");
				
		//Convert Map to List and filter by value > N
        List<Map.Entry<Integer, String>> list8 = map.entrySet().stream().filter(s->s.getKey()%2==0).toList();
		System.out.println(list8);
		System.out.println("\n");
		
		//
	}
}
