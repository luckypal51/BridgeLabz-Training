package com.inheritence;

public class Teacher extends Person{
    String subject;
	public Teacher(String name, int age,String subject) {
		super(name, age);
		this.subject = subject;
	}
    @Override
    public void personDetail() {
    	// TODO Auto-generated method stub
    	super.personDetail();
    	System.out.println("Subject     : "+this.subject);
    	System.out.println("Role        : Teacher");
    }
}
