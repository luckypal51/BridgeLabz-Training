package com.objectmodeling.level2;

import java.util.*;

public class Student {
	   
	   ArrayList<Subject> arr = new ArrayList<>();
       
	   private String name;
       private int rollno;
	  
       public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	   }
       
       public void addSubject(String subject,float marks) {
    	   arr.add(new Subject(subject,marks));
       }
       
       public void studentDetail() {
    	   System.out.println("--------------------------------------------");
    	   System.out.println("Name of the student    :"+this.name);
    	   System.out.println("Rollno of the student  :"+this.rollno);
    	   System.out.println("Total no of subject is :"+this.arr.size());
    	   for(Subject s: arr) {
    		   System.out.println(s.getName()+" : "+s.getMarks());
    	   }
       }

	   public String getName() {
		   return name;
	   }

	   public void setName(String name) {
		   this.name = name;
	   }

	   public int getRollno() {
		   return rollno;
	   }

	   public void setRollno(int rollno) {
		   this.rollno = rollno;
	   }
}
