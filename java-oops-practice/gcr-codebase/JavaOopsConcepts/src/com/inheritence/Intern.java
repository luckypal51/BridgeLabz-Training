package com.inheritence;

public class Intern extends Employee {
    public String mentorName;
	public Intern(String name, int empId, float salary,String mentorName) {
		super(name, empId, salary);
		this.mentorName = mentorName;
	}
	   @Override
	    public void displayDetails() {
	    	 System.out.println("----Employee Details-----");
	    	 System.out.println("Name                : "+this.name);
	    	 System.out.println("Id                  : "+this.empId);
	    	 System.out.println("Salary              : "+this.salary);
	    	 System.out.println("Mentor Name         : "+this.mentorName);
	    }

}
