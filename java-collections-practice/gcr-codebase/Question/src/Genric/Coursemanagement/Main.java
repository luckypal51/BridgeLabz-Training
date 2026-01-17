package Genric.Coursemanagement;

public class Main {
     public static void main(String[] args) {
    	 Course<CourseType> course = new Course();
    	 
    	 course.addCourse(new ResearchCourse("AI",3));
    	 course.addCourse(new ExamCourse("Data Structure", 6));
    	 course.addCourse(new AssignmentCourse("Object Oriented Programming", 4));
    	 course.view();
     }
}
