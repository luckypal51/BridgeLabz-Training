package com.objectmodeling;
import java.util.ArrayList;

class University {
    private String universityName;
    private ArrayList<Department1> departments = new ArrayList<>();
    private ArrayList<Faculty> faculties = new ArrayList<>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    // Composition
    public void addDepartment(String deptName) {
        departments.add(new Department1(deptName));
    }

    // Aggregation
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department1 d : departments) {
            d.display();
        }

        System.out.println("Faculty Members:");
        for (Faculty f : faculties) {
            f.display();
        }
    }

    // Composition proof
    public void closeUniversity() {
        departments.clear(); // deletes departments
        System.out.println("University closed. All departments removed.");
    }
}
