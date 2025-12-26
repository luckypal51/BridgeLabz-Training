package com.classandobject.level1;

public class Employe {
	//non-static variables
		String name;
		int id;
		double salary;
		
		//Constructor
		Employe(String name, int id,double salary){
			this.name=name;
			this.id=id;
			this.salary=salary;
		}
		public void display() {
			System.out.println("Employee Name: "+name);
			System.out.println("Employee id: "+id);
			System.out.println("Employee Salary: "+salary);

		}
		
}
