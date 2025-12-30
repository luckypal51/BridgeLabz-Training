package com.objectmodeling;
class Department1 {
    private String deptName;

    public Department1(String deptName) {
        this.deptName = deptName;
    }

    public void display() {
        System.out.println("Department: " + deptName);
    }
}
