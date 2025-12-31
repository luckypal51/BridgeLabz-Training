package com.inheritence;

public class Developer extends Employee{
    public String programmingLanguage;
	public Developer(String name, int empId, float salary,String programmingLanguage) {
		super(name, empId, salary);
		this.programmingLanguage = programmingLanguage;
	}
     @Override
    public void displayDetails() {
    	 System.out.println("----Employee Details-----");
    	 System.out.println("Name                : "+this.name);
    	 System.out.println("Id                  : "+this.empId);
    	 System.out.println("Salary              : "+this.salary);
    	 System.out.println("Programing Language : "+this.programmingLanguage);
    }
}
