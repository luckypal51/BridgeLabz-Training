package employee;

import java.util.stream.Collectors;
import java.util.*;

public class Main {
     public static void main(String[] args) {
    	  List<Employee> employees = new ArrayList<>();

          employees.add(new Employee(1, "Lucky", 25, Gender.MALE, "IT", 2021, 55000));
          employees.add(new Employee(2, "Arvind", 28, Gender.MALE, "HR", 2020, 48000));
          employees.add(new Employee(3, "Himesh", 32, Gender.MALE, "Finance", 2018, 72000));
          employees.add(new Employee(4, "Nagesh", 26, Gender.MALE, "IT", 2022, 50000));
          employees.add(new Employee(5, "Riya", 24, Gender.FEMALE, "Marketing", 2023, 42000));
          employees.add(new Employee(6, "Sneha", 29, Gender.FEMALE, "HR", 2019, 53000));
          employees.add(new Employee(7, "Amit", 35, Gender.MALE, "Finance", 2016, 90000));
          employees.add(new Employee(8, "Neha", 27, Gender.FEMALE, "IT", 2021, 60000));
          employees.add(new Employee(9, "Rahul", 31, Gender.MALE, "Sales", 2017, 65000));
          employees.add(new Employee(10, "Pooja", 26, Gender.FEMALE, "Sales", 2022, 47000));
          employees.add(new Employee(11, "Karan", 34, Gender.MALE, "Admin", 2015, 58000));
          employees.add(new Employee(12, "Divya", 28, Gender.FEMALE, "Marketing", 2020, 52000));
          employees.add(new Employee(13, "Suresh", 40, Gender.MALE, "Admin", 2012, 75000));
          employees.add(new Employee(14, "Anjali", 23, Gender.FEMALE, "IT", 2023, 40000));
          employees.add(new Employee(15, "Vikram", 37, Gender.MALE, "Finance", 2014, 85000));

          
          //Number of Female and Male Employee 
          Map<Gender, Long> map = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
          for(var a: map.entrySet()) {
        	  System.out.println(a.getKey()+" : "+a.getValue());
          }
          System.out.println("\n");
          //Name of All the department in the organization
		  Map<String,List<Employee>>dept = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
          for(var a : dept.entrySet()) {
        	  System.out.println("Department : "+a.getKey());
          }
          System.out.println("\n");
          //Average Age of the Female and Male employee
          Map<Gender, Double> map1 = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
          for(var a: map1.entrySet()) {
        	  System.out.println(a.getKey()+" Average Age is : "+a.getValue());
          }
          System.out.println("\n");
          //highest paid employee Details 
          Optional<Employee> emp = employees.stream().max((Employee a,Employee b)->Double.compare(a.getSalary(),b.getSalary()));
          System.out.println(emp.toString());
          
          System.out.println("\n");
          //Name of the employee joined after 2015
          
          employees.stream().filter(x->x.getYearOfJoining()>2015).forEach(x->System.out.println("Employee Name : "+x.getName()));
          
          
          //Number Of Employees In each Department 
          Map<String,Long> map2 = employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
          for(var a : map2.entrySet()) {
        	  System.out.println(a.getKey()+" no of employees "+a.getValue());
          }
          System.out.println("\n");
          //Average salary of each department 
          Map<String,Double> map3 = employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
          for(var a : map3.entrySet()) {
        	  System.out.println(a.getKey()+" no of employees "+a.getValue());
          }
          System.out.println("\n");
          //youngest employee in the organization
          Optional<Employee> emp2 = employees.stream().min(( a, b)->Integer.compare(a.getAge(), b.getAge()));
          System.out.println(emp2.toString());
          
          System.out.println("\n");
          //Employee Who has Most Work Experience 
          Optional<Employee> emp3 = employees.stream().min((a,b)->Integer.compare(a.getYearOfJoining(),b.getYearOfJoining()));
          System.out.println("Employee who has most work experience "+emp3.toString());
          System.out.println("\n");
          
         //Number Of female and male working in sales
          Map<Gender, Long> map4 = employees.stream().filter(x->x.getDept().equalsIgnoreCase("sales")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
          System.out.println("Number Of Male And Female Working in Sales");
          for(var a : map4.entrySet()) {
        	  System.out.println(a.getKey()+" : "+a.getValue());
          }
          System.out.println("\n");
          //Number Of female and male working in sales
          Map<Gender,Double> map5 = employees.stream().filter(x->x.getDept().equalsIgnoreCase("sales")).collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
          System.out.println("Average salary Of Male And Female");
          for(var a : map5.entrySet()) {
        	  System.out.println(a.getKey()+" : "+a.getValue());
          }
          System.out.println("\n");
          //Name of employee in each departments 
          Map<String, List<String>> map6 = employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.mapping(Employee::getName,Collectors.toList())));
          for(var a: map6.entrySet()) {
        	  System.out.println(a.getKey()+" : "+a.getValue());
          }
          System.out.println("\n");
         //average and total salary of the whole organization 
         DoubleSummaryStatistics data = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
         System.out.println("Total Salary is   : "+data.getSum());
         System.out.println("Average Salary is : "+data.getAverage());
         System.out.println("\n");
         
         //Employees who's salary is greater than 50k
         System.out.println("Employees Who's Salary is greater than 50000 : ");
         employees.stream().filter(x->x.getSalary()>50000).forEach(System.out::println);
         System.out.println("\n");
         //Second Highest salary in the organization 
         Optional<Employee> emp5 = employees.stream().sorted((Employee a,Employee b)->Double.compare(b.getSalary(), a.getSalary())).skip(1).findFirst();
         System.out.println("The Second highest Salary is : "+emp5.toString());
         System.out.println("\n");
         //Third Highest Paid Employee 
         Optional<Employee> emp6 = employees.stream().sorted((Employee a,Employee b)->Double.compare(b.getSalary(), a.getSalary())).skip(2).findFirst();
         System.out.println("The Second highest Salary is : "+emp6.toString());
         System.out.println("\n");
         //Lowest Paid Employee in the organization 
         Optional<Employee> emp7 = employees.stream().min((a,b)->Double.compare(a.salary,b.getSalary()));
         System.out.println("Lowest Paid Employee is : "+emp7.toString());
         System.out.println("\n");
         //Second Lowest Paid Employee in the organization 
         Optional<Employee> emp8 = employees.stream().sorted((a,b)->Double.compare(a.getSalary(), b.getSalary())).skip(1).findFirst();
         System.out.println("Second Lowest Paid Employee Is : "+emp8.toString());
         System.out.println("\n");
         //Top 5 lowest paid employee 
         System.out.println("\nTop 5 Lowest Paid Employees :");
         employees.stream().sorted((a,b)->Double.compare(a.getSalary(), b.getSalary())).limit(5).forEach(System.out::println);
         //Top 5 Highest Paid Employee
         System.out.println("\nTop5 Highest Paid Employees :");
         employees.stream().sorted((a,b)->Double.compare(b.getSalary(), a.getSalary())).limit(5).forEach(System.out::println);
	}
}
