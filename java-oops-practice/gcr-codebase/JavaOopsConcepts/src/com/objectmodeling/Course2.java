package com.objectmodeling;
import java.util.ArrayList;

class Course2 {
    private String courseName;
    private Professor professor;
    private ArrayList<Student2> students = new ArrayList<>();

    public Course2(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Communication
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
        System.out.println("Professor " + professor.getName()
                + " assigned to " + courseName);
    }

    public void addStudent(Student2 student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void viewStudents() {
        System.out.println("Course: " + courseName + " Students:");
        for (Student2 s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}
