package conversion.listTomap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class ListToMap {
     public static void main(String[] args) {
		//List to Map 
    	List<String> list = List.of("Lucky","is","a","Best","coder");
    	Map<String, Integer> map = list.stream().collect(Collectors.toMap(s->s,String::length));
    	System.out.println(map);
    	System.out.println("\n");
    	
    	//Number with its square
    	List<Integer> list1 = List.of(1,2,3,4,5);
    	Map<Integer,Integer> map1 = list1.stream().collect(Collectors.toMap(s->s,s->s*s));
    	map1.entrySet().forEach((a)->System.out.println(a.getKey()+" - "+a.getValue()));
	    System.out.println("\n");
	    
	    //Convert List of employees to Map with id as key and name as value
	    List<Employee> emp = new ArrayList<>();
	    emp.add(new Employee(101,"Lucky",45000));
	    emp.add(new Employee(102,"Himesh",150000));
	    emp.add(new Employee(103,"Nageshwar",78000));
	    Map<Integer,Employee> map2 = emp.stream().collect(Collectors.toMap(Employee::getId,e->e));
	    map2.entrySet().forEach((a)->System.out.println(a.getKey()+" - "+a.getValue().toString()));
	    System.out.println("\n");
	    
	    //Convert List of words to Map with word and frequency
	    List<String> list2 = List.of("Lucky","is","a","Best","coder","Lucky");
	    Map<String,Long> map3 = list2.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
	    map3.entrySet().forEach(a->System.out.println(a.getKey()+" - "+a.getValue()));
	    System.out.println("\n");
	    
	    //Convert List to Map with index as key and element as value
	    List<String> list3 = List.of("Lucky","is","a","Best","coder");
	    Map<Integer,String> map4 = list3.stream().collect(Collectors.toMap(s->list3.indexOf(s),s->s));
	    map4.entrySet().stream().forEach(a->System.out.println(a.getKey()+" - "+a.getValue()));
	    System.out.println("\n");
	    
	    //Convert List of objects to Map using custom key field
	    List<Employee> emp2 = new ArrayList<>();
	    emp2.add(new Employee(101,"Lucky",45000));
	    emp2.add(new Employee(102,"Himesh",150000));
	    emp2.add(new Employee(103,"Nageshwar",78000));
	    emp2.add(new Employee(101,"Arvind",47000));
	    Random rm = new Random();
	    Map<Integer,Employee> map5 = emp2.stream().collect(Collectors.toMap(s->rm.nextInt(1500),e->e));
	    map5.forEach((a,b)->System.out.println(a+" - "+b.toString()));
	    System.out.println("\n");
	    
	    //Convert List to Map and handle duplicate keys
	    Map<Integer,List<Employee>>map6 = emp2.stream().collect(Collectors.groupingBy(Employee::getId));
	    map6.forEach((a,b)->System.out.println(a+" - "+b));
	    System.out.println("\n");
	    
	    //.Convert List to Map keeping only first duplicate
	    Map<Integer, Employee> map7 = emp2.stream().collect(Collectors.toMap(Employee::getId,e -> e,(existing, duplicate) -> existing ));

	    	map7.forEach((a, b) -> System.out.println(a + " - " + b));
       System.out.println("\n");
	    //Convert List to Map keeping only last duplicate
	    Map<Integer,Employee> map8 = emp2.stream().collect(Collectors.toMap(s->s.getId(),s->s,(a,b)->b));
	    System.out.println(map8);
	    System.out.println("\n");
	    
	    //Convert List into Map grouped by string length
	    Map<Integer,List<Employee>> map9 = emp2.stream().collect(Collectors.groupingBy(s->s.getName().length()));
	    map9.forEach((a,b)->System.out.println(a+" - "+b));
	    
	    //
     }
}
