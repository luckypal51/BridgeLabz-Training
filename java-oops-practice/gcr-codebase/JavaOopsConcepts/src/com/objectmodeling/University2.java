package com.objectmodeling;
import java.util.ArrayList;

class University2 {
    private String universityName;
    private ArrayList<Student2> students = new ArrayList<>();
    private ArrayList<Professor> professors = new ArrayList<>();

    public University2(String universityName) {
        this.universityName = universityName;
    }

    public void addStudent(Student2 student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);
        System.out.println("Total Students: " + students.size());
        System.out.println("Total Professors: " + professors.size());
    }
}
