package com.inheritence;

public class Students extends Person{
    char grade;
	public Students(String name, int age,char grade) {
		super(name, age);
		this.grade = grade;
	}
    @Override
    public void personDetail() {
    	// TODO Auto-generated method stub
    	super.personDetail();
    	System.out.println("Grade       : "+this.grade);
    	System.out.println("Role        : Student");
    }
}
