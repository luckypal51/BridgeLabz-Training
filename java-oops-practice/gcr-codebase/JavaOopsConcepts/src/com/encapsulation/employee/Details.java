package com.encapsulation.employee;

public abstract class Details {
	String name;
	long empId;
	double salary;
	
	public Details(String name,long empId,double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
      public abstract double calculateSalary(double salary);
      
      public void displayDetails() {
    	  System.out.println("-------Personal Details-----------");
    	  System.out.println("Name         : "+this.name);
    	  System.out.println("Employee Id  : "+this.empId);
    	  System.out.println("salary       : "+this.salary);
    	  
      }
}
