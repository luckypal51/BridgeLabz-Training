package com.objectmodeling;
import java.util.ArrayList;

class Professor {
    private int professorId;
    private String name;
    private ArrayList<Course2> courses = new ArrayList<>();

    public Professor(int professorId, String name) {
        this.professorId = professorId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course2 course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println("Professor: " + name + " teaches:");
        for (Course2 c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}
