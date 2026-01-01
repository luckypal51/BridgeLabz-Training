package com.encapsulation.employee;

public class Main {
      public static void main(String[] args) {
    	  Employee emp = new Employee("Lucky Pal",101,425000);
    	  PartTimeEmployee part = new PartTimeEmployee("Himesh",102,5);
    	  FullTimeEmployee full = new FullTimeEmployee("Nageshwar",103,13);
    	  emp.displayDetails();
    	  part.displayDetails();
    	  full.displayDetails();
      }
}
