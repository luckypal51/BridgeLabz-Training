package com.objectmodeling;

public class UniversityManagement {
	public static void main(String[] args) {

        Faculty f1 = new Faculty(101, "Lucky");
        Faculty f2 = new Faculty(102, "himesh");

        University uni = new University("Technocrats Institute of Technology");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.displayUniversity();

        System.out.println("\nClosing University...\n");
        uni.closeUniversity();

        // Faculty still exists
        f1.display();
        f2.display();
    }
}
