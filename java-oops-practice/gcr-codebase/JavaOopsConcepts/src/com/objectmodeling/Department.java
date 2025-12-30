package com.objectmodeling;
import java.util.ArrayList;

class Department {
    private String deptName;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void addEmployee(int id, String name) {
        employees.add(new Employee(id, name));
    }

    public void display() {
        System.out.println(" Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}
