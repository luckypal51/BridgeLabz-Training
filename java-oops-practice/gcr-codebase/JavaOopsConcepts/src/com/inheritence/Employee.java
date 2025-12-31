package com.inheritence;

public class Employee {
     String name;
     int empId;
     float salary;
	 public Employee(String name, int empId, float salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	 }
     public void displayDetails() {
    	 System.out.println("----Employee Details-----");
    	 System.out.println("Name   : "+this.name);
    	 System.out.println("Id     : "+this.empId);
    	 System.out.println("Salary : "+this.salary);
     }
}
