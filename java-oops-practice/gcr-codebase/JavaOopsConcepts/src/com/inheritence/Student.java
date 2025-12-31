package com.inheritence;

public class Student {
	public static void main(String[] args) {
		PaidOnlineCourse poc = new PaidOnlineCourse("java programing",5,"udemy",true,1200f,20f);
		OnlineCourse oc = new OnlineCourse("java-programming",5,"physic-wallah",true);
		Course c = new Course("java-programming",5);
		
		c.courseDetail();
		oc.courseDetail();
		poc.courseDetail();
	}
}
