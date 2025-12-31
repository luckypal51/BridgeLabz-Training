package com.inheritence;

public class Course {
     protected String name;
     protected int duration;
	 public Course(String name, int duration) {
		super();
		this.name = name;
		this.duration = duration;
	 }
    
	 public void courseDetail() {
		 System.out.println("--------Course Details---------");
		 System.out.println("Course Name : "+this.name);
		 System.out.println("Duration    : "+this.duration);
	 }
}
