package com.encapsulation.employee;

public class Employee extends Details{
     double salary;
	 public Employee(String name, long empId,double salary) {
		 super(name,empId,salary);
		 this.salary = calculateSalary(salary);
	 }
	 @Override
	 public double calculateSalary(double salary) {
		return salary/12;
	 }
     
	 @Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("Base-Salary  : "+this.salary);
	}
}
