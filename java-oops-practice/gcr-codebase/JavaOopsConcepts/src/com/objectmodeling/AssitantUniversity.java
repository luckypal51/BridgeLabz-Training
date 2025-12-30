package com.objectmodeling;

public class AssitantUniversity {
	  public static void main(String[] args) {

	        University2 uni = new University2("Global Tech University");

	        Student2 s1 = new Student2(1, "Lucky");
	        Student2 s2 = new Student2(2, "Rahul");

	        Professor p1 = new Professor(101, "Dr. Sharma");

	        Course2 c1 = new Course2("Data Structures");
	        Course2 c2 = new Course2("Java Programming");

	        uni.addStudent(s1);
	        uni.addStudent(s2);
	        uni.addProfessor(p1);

	        c1.assignProfessor(p1);
	        c2.assignProfessor(p1);

	        s1.enrollCourse(c1);
	        s1.enrollCourse(c2);
	        s2.enrollCourse(c1);

	        s1.viewCourses();
	        s2.viewCourses();

	        p1.viewCourses();

	        c1.viewStudents();
	    }
}
