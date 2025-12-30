package com.objectmodeling;
import java.util.ArrayList;

class Student2 {
    private int studentId;
    private String name;
    private ArrayList<Course2> courses = new ArrayList<>();

    public Student2(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Communication + Association
    public void enrollCourse(Course2 course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
            System.out.println(name + " enrolled in " + course.getCourseName());
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name + " Courses:");
        for (Course2 c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}
