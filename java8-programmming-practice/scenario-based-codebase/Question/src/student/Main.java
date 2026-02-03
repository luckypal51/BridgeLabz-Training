package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Random random = new Random();

        students.add(new Student(1, "Amit", 20, Gender.MALE, "Delhi",random.nextInt(100) + 1, "900000001"));
        students.add(new Student(2, "Neha", 21, Gender.FEMALE, "Mumbai",random.nextInt(100) + 1, "900000002"));
        students.add(new Student(3, "Rahul", 22, Gender.MALE, "Bangalore",random.nextInt(100) + 1, "900000003"));
        students.add(new Student(4, "Pooja", 19, Gender.FEMALE, "Delhi",random.nextInt(100) + 1, "900000004"));
        students.add(new Student(5, "Vikram", 23, Gender.MALE, "Mumbai",random.nextInt(100) + 1, "900000005"));
        students.add(new Student(6, "Anjali", 20, Gender.FEMALE, "Bangalore",random.nextInt(100) + 1, "900000006"));
        students.add(new Student(7, "Suresh", 21, Gender.MALE, "Delhi",random.nextInt(100) + 1, "900000007"));
        students.add(new Student(8, "Kiran", 22, Gender.FEMALE, "Mumbai",random.nextInt(100) + 1, "900000008"));
        students.add(new Student(9, "Ravi", 23, Gender.MALE, "Bangalore",random.nextInt(100) + 1, "900000009"));
        students.add(new Student(10, "Sneha", 19, Gender.FEMALE, "Delhi",random.nextInt(100) + 1, "900000010"));
        students.add(new Student(11, "Arjun", 20, Gender.MALE, "Mumbai",random.nextInt(100) + 1, "900000011"));
        students.add(new Student(12, "Meena", 21, Gender.FEMALE, "Bangalore",random.nextInt(100) + 1, "900000012"));
        students.add(new Student(13, "Nikhil", 22, Gender.MALE, "Delhi",random.nextInt(100) + 1, "900000013"));
        students.add(new Student(14, "Ritu", 23, Gender.FEMALE, "Mumbai",random.nextInt(100) + 1, "900000014"));
        students.add(new Student(15, "Manoj", 19, Gender.MALE, "Bangalore",random.nextInt(100) + 1, "900000015"));
        students.add(new Student(16, "Divya", 20, Gender.FEMALE, "Delhi",random.nextInt(100) + 1, "900000016"));
        students.add(new Student(17, "Karthik", 21, Gender.MALE, "Mumbai",random.nextInt(100) + 1, "900000017"));
        students.add(new Student(18, "Shreya", 22, Gender.FEMALE, "Bangalore",random.nextInt(100) + 1, "900000018"));
        students.add(new Student(19, "Ramesh", 23, Gender.MALE, "Delhi",  random.nextInt(100) + 1, "900000019"));
        students.add(new Student(20, "Isha", 19, Gender.FEMALE, "Mumbai",random.nextInt(100) + 1, "900000020"));

        //Student whose rank are less than 50
        students.stream().filter(x->x.getRank()<50).forEach(System.out::println);
        System.out.println("\n");
        
        //Student whose age is greater than 20
        students.stream().filter(x->x.getAge()>20).forEach(System.out::println);
        System.out.println("\n");
        
        //Students Name only 
        System.out.println("Name of the Student : ");
        students.stream().map(Student::getName).forEach(x->System.out.println(x));
        System.out.println("\n");
        
        //Student who do not belongs to Mumbai
        students.stream().filter(x->!x.getCity().equalsIgnoreCase("Mumbai")).forEach(System.out::println);
        System.out.println("\n");
        
        //Student sorted by rank in ascending order
        students.stream().sorted((a,b)->Integer.compare(a.getRank(),b.getRank())).forEach(System.out::println);
        System.out.println("\n");
        
        //Student sorted by age in descending order
        students.stream().sorted((a,b)->Integer.compare(b.getAge(), a.getAge())).forEach(System.out::println);
        System.out.println("\n");
        
        //Top 5 Student based on rank
        students.stream().sorted((a,b)->Integer.compare(a.getRank(), b.getRank())).limit(5).forEach(System.out::println);
        System.out.println("\n");
        
        //Last 3 Student based on rank
        students.stream().sorted((a,b)->Integer.compare(b.getRank(),b.getRank())).limit(3).forEach(System.out::println);
        System.out.println("\n");
        
        //Sorting by Name and then by rank
        students.stream().sorted(Comparator.comparing(Student::getName).thenComparingInt(Student::getRank)).forEach(System.out::println);
        System.out.println("\n");
        
        //Number of Student from each city 
        Map<String,Long> map = students.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.counting()));
        for(var a : map.entrySet()) {
        	System.out.println(a.getKey()+" - "+a.getValue());
        }
        System.out.println("\n");
        //Average age of students by gender 
        Map<Gender,DoubleSummaryStatistics>  map2 = students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.summarizingDouble(Student::getAge)));
        for(var a : map2.entrySet()) {
        	System.out.println(a.getKey()+" : "+a.getValue().getAverage());
        }
        System.out.println("\n");
        //Average rank of students by gender 
        Map<Gender,DoubleSummaryStatistics>  map3 = students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.summarizingDouble(Student::getRank)));
        for(var a : map2.entrySet()) {
        	System.out.println(a.getKey()+" : "+a.getValue().getAverage());
        }
        System.out.println("\n");
        //Number Of Students in the organization 
        Optional<Long> noStudent = Optional.of(students.stream().count());
        System.out.println("Number Of Students are : "+noStudent);
        System.out.println("\n");
        
        //Highest Rank from each city 
        Map<String, Optional<Student>> map4 = students.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.maxBy(Comparator.comparing(Student::getRank))));
        for(var a: map4.entrySet()) {
        	System.out.println(a.getKey()+" - "+a.getValue().toString());
        }
        System.out.println("\n"); 
        //Student with lowest rank 
        Optional<Student> lowest = students.stream().min(Comparator.comparing(Student::getRank));
        System.out.println("Student with lowest rank : "+lowest.toString());
        System.out.println("\n");
        
        //Student with highest rank
        Optional<Student> highest = students.stream().max(Comparator.comparing(Student::getRank));
        System.out.println("Student with Highest rank: "+highest.toString());
        System.out.println("\n");
        
        //Find second best rank holder
        Optional<Student> second = students.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst();
        System.out.println("Second best rank holder "+second.toString());
        System.out.println("\n");
        
        //Find Third Best Rank holder
        Optional<Student> third  = students.stream().sorted(Comparator.comparing(Student::getRank)).skip(2).findFirst();
        System.out.println("Third Best Rank Holder : "+third.toString());
        System.out.println("\n");
        
        //Find The Youngest Student 
        Optional<Student> youngest = students.stream().min(Comparator.comparing(Student::getAge));
        System.out.println("The Youngest Student is : "+youngest.toString());
        System.out.println("\n");
        
        //Find The Oldest Student
        Optional<Student> oldest = students.stream().max(Comparator.comparing(Student::getAge));
        System.out.println("The Oldest Student is   : "+oldest.toString());
        System.out.println("\n");
        
        //Check If all Students are above 20 age 
        boolean studentage = students.stream().allMatch(s->s.getAge()>20);
        System.out.println("All students are above 20 : "+studentage);
        System.out.println("\n");
        
        //Count Male And Female Student
        Map<Gender,Long> map5 = students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        for(var a: map5.entrySet()) {
        	System.out.println(a.getKey()+" - "+a.getValue());
        }
        System.out.println("\n");
        //Average Age of Male and Female Student 
        Map<Gender,IntSummaryStatistics> map6 = students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.summarizingInt(Student::getAge)));
        for(var a: map6.entrySet()) {
        	System.out.println(a.getKey()+" - "+a.getValue().getAverage());
        }
        System.out.println("\n");
        //Highest rank by male and female student
        Map<Gender, Optional<Student>> map7 = students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.maxBy(Comparator.comparing(Student::getRank))));
        for(var a: map7.entrySet()) {
        	System.out.println("Highest rank by "+a.getKey()+" is "+a.getValue());
        }
        System.out.println("\n");
        //Convert List to Map(id,name)
        Map<Integer,String> map8 = students.stream().collect(Collectors.toMap(Student::getId,Student::getName));
        System.out.println(map8);
        System.out.println("\n");
        
        //Convert List To Map(id,ArrayList<Student>)
        Map<Integer,List<Student>> map9 = students.stream().collect(Collectors.groupingBy(Student::getId));
        for(var a : map9.entrySet()) {
        	System.out.println(a.getKey()+" = "+a.getValue());
        }
        System.out.println("\n");
        
        //Student whose name starts with "s"
        students.stream().filter(s->s.getName().startsWith("S")).forEach(System.out::println);
        System.out.println("\n");
        
        //Student whose name length is greater than 5
        students.stream().filter(s->s.getName().length()>5).forEach(System.out::println);
        System.out.println("\n");
        
        //Student whose rank is even 
        students.stream().filter(s->s.getRank()%2==0).forEach(System.out::println);
        System.out.println("\n");
        
        //Student whose rank is odd 
        students.stream().filter(s->s.getRank()%2!=0).forEach(System.out::println);
        System.out.println("\n");
        
        //Top 3 youngest Student 
        students.stream().sorted(Comparator.comparing(Student::getAge)).limit(3).forEach(System.out::println);
        System.out.println("\n");
        
        //Top 3 Oldest Student 
        students.stream().sorted(Comparator.comparing(Student::getAge).reversed()).limit(3).forEach(System.out::println);
        System.out.println("\n");
        
        //City with maximum student
        Map<String, Long> map10 = students.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.counting()));
        String s = "";
        Long min = 0l;
        for(var a : map10.entrySet()) {
        	if(min<a.getValue()) {
        		min = a.getValue();
        		s= a.getKey();
        		}
        }
        System.out.println(s+" - "+min);
        System.out.println("\n");
        
	}
}
