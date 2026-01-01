package com.encapsulation.employee;

public class PartTimeEmployee extends Employee {
	
     public PartTimeEmployee(String name,int empId,int hours) {
    	 super(name,empId,(3888*hours)*12);
     }
    
}
