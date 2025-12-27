package com.constructinstance.level1;

public class Course {
      public static String insitituteName= "TIT";
      String courseName;
      int duration;
      float fees;
      
      public Course(String courseName,int duration,float fees) {
    	  this.courseName = courseName;
    	  this.duration = duration;
    	  this.fees = fees;
      }
      public void courseDetail() {
    	  System.out.println("The name of institute "+insitituteName);
    	  System.out.println("The name of course "+this.courseName);
    	  System.out.println("The duration of course "+this.duration);
    	  System.out.println("The fees of course "+this.fees);
      }
      public static void updateInstituteName(String name) {
    	  String perv = insitituteName;
    	  insitituteName = name;
    	  System.out.println("name "+perv+" change to "+insitituteName);
      }
      public static void main(String[] args) {
    	  Course c = new Course("Java developer",6,5000);
    	  Course.updateInstituteName("Lucky Institute");
    	  c.courseDetail();
      }
}
