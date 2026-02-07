package logicalQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class StringAndList {
   @SuppressWarnings("unchecked")
public static void main(String[] args) {
	String str = "Programming";
	String vowels = "aeiou";
	Optional<Long>count = Optional.of(str.chars().filter(s->vowels.contains(""+(char)s)).count());
	System.out.println("Total Number of vowels are : "+count.get());
	System.out.println("\n");
	//count no of words 
	String word = "Java is very powerFul";
	Optional<Long> words = Optional.of(Arrays.stream(word.split("\\s+")).count());
	System.out.println("Total number of words are : "+words.get());
	System.out.println("\n");
	//get even number from list
	ArrayList<Integer> arr = new ArrayList<>();
	arr.add(2);
	arr.add(5);
	arr.add(7);
	arr.add(8);
	arr.add(10);
	arr.add(13);
	
	List<Integer> even = arr.stream().filter(a->a%2==0).toList();
	System.out.println("The even number elements : "+even);
	System.out.println("\n");
	//convert to lowerCase to toUpperCase from the list
	List<String> s = Arrays.asList("java","python","Lucky");
    List<String> s1 = s.stream().map(String::toUpperCase).toList();
    System.out.println("Converted To UpperCase : "+s1);
    System.out.println("\n");
	
    
    //find length of string in list
    List<Integer> len = s.stream().map(a->a.length()).toList();
    System.out.println(len);
    System.out.println("\n");
    
    //Count strings starting with ‘a’
    List<String> list1 = Arrays.asList("apple","banana","ant","car");
    Optional<Long> start = Optional.of(list1.stream().filter(x->x.startsWith("a")).count());
    System.out.println("Number Of Words Starts With a : "+start.get());
    System.out.println("\n");
    
    //remove empty string from list
    List<String> list2 = Arrays.asList("apple","banana","","ant","car","");
    List<String> list3 = list2.stream().filter(x->!x.equals("")).toList();
    System.out.println("Removed '' empty string from list : "+list3);
    System.out.println("\n");
    //sum the total elements from list
    List<Integer> list4 = Arrays.asList(1,2,3,4,5);
    Optional<Integer> sum = Optional.ofNullable(list4.stream().reduce(0,(x1,x2)->x1+x2));
    System.out.println("Total sum is : "+sum.get());
    System.out.println("\n");
    
    //max elements from the list
    List<Integer> list5 = Arrays.asList(10,25,3,99,45);
    Optional<Integer>max = list5.stream().max(Comparator.comparing(a->a));
    System.out.println("max element is : "+max.get());
    System.out.println("\n");
    //reverse string in the list
    List<String> list6 = Arrays.asList("apple","banana","ant","car");
    list6.stream().map(x->new StringBuilder(x).reverse().toString()).forEach(System.out::println);
    System.out.println("\n");
    
    //remove duplicate elements 
    List<Integer> list7 = Arrays.asList(1,2,2,3,4,4,5);
    List<Integer> distinct = list7.stream().distinct().toList();
    System.out.println(distinct);
    System.out.println("\n");
    //sort the list in ascending 
    List<Integer> list8 = Arrays.asList(5,1,9,3);
    List<Integer> desc = list8.stream().sorted((a,b)->Integer.compare( b,a)).toList();
    System.out.println("Sorted in descending order : "+desc);
    System.out.println("\n");
    
    //second highest elements 
    List<Integer> list9 = Arrays.asList(5,1,9,3);
    Optional<Integer> secondHighest = list8.stream().sorted((a,b)->Integer.compare( b,a)).skip(1).findFirst();
    System.out.println("Second Highest Elements  : "+secondHighest.get());
    System.out.println("\n");
    
    //longest String in the list
    List<String> list10 = Arrays.asList("java","microservices","api");
    Optional<String> maxlen = list10.stream().max((a,b)->Integer.compare(a.length(),b.length()));
    System.out.println("Longest String is : "+maxlen.get());
    System.out.println("\n");
    
    //find duplicate element from the list
    HashSet<Integer> set = new HashSet<>();
    Optional<List<Integer>> dup = Optional.of(list7.stream().filter(x->!set.add(x)).toList());
    System.out.println("Duplicated Elements are : "+dup.get());
    System.out.println("\n");
    
    //Frequency of the character from the string
    String st = "banana";
    Map<Character,Long> map1 = st.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting()));
    System.out.println(map1);
    System.out.println("\n");
    
    //Group string by length
    List<String> list11 = List.of("a","bb","ccc","dd");
    Map<Integer,List<String>> map2 = list11.stream().collect(Collectors.groupingBy(x->x.length()));
    System.out.println(map2);
    System.out.println("\n");
    
    //First Non Repeating Character 
    String s2 = "stress";
    Optional<Character> ch = s2.chars().mapToObj(x->(char)x).filter(x->s2.indexOf(x)==s2.lastIndexOf(x)).findAny();
    System.out.println("First Non Repeating Character : "+ch.get());
    System.out.println("\n");
    
    //Convert Integer list to String list
    List<Integer> list12 = List.of(1,2,3);
    List<String> list13 = list12.stream().map(x->String.valueOf(x)).toList();
    System.out.println("Converted into String List "+list13);
    System.out.println("\n");
    
    //flat the list of list into list 
    List<List<Integer>> list14 = List.of(List.of(1,2),List.of(3,4),List.of(5));
    list14.stream().flatMap(List::stream).forEach(System.out::println);
    System.out.println("\n");
    
    //Square of even number and sum
    List<Integer> list15 = List.of(1,2,3,4,5);
    Optional<Integer> square = list15.stream().filter(x->x%2==0).map(x->x*x).reduce((a,b)->a+b);
    System.out.println("Sum of Square of even number : "+square.get());
    System.out.println("\n");
    
    //Sort HashMap By Value 
    Map<Character,Integer> map = new HashMap<>();
    map.put('A',3);
    map.put('B', 2);
    map.put('C', 1);
    map.entrySet().stream().sorted((a,b)->Integer.compare(a.getValue(), b.getValue())).forEach(x->System.out.println(x.getKey()+"-"+x.getValue()));
    System.out.println("\n");
    
    //Common Elements between to list;
    List<Integer> list17 = List.of(1,2,3,4);
    List<Integer> list16 = List.of(3,4,5,6);
    HashSet<Integer> set1 = new HashSet<>(list17);
    Optional<List<Integer>>result = Optional.of(list16.stream().filter(x->!set1.add(x)).toList());
    System.out.println(result.get());
    System.out.println("\n");
    
    //Keep only alphabet 
    String str4 = "stre123ss";
    Optional<String> re = Optional.of(str4.chars().mapToObj(x->String.valueOf((char)x)).filter(x->Character.isAlphabetic(x.charAt(0))).collect(Collectors.joining()));
    System.out.println(re.get().toString());
    System.out.println("\n");
    
    //Keep Only Digit
    String str5 = "stre123ss";
    Optional<String> re1 = Optional.of(str5.chars().mapToObj(x->String.valueOf((char)x)).filter(x->Character.isDigit(x.charAt(0))).collect(Collectors.joining()));
    System.out.println(re1.get().toString());
    System.out.println("\n");
    
    String str6 = "java stream ";
    Map<Character, Long> map78 = str6.chars().mapToObj(x->(char)x).filter(x->x!=' ').collect(Collectors.groupingBy(x->x,Collectors.counting()));
    map78.entrySet().forEach(x->System.out.println(x.getKey()+" - "+x.getValue()));
    System.out.println("\n");
   }
}
