package com.classandobject.level2;

public class StudentGradePrint {

	public static void main(String[] args) {
		double[] mark1 = {80,70,75};
		double[] mark2 = {60,65,50};
		
		//object creating for constructor invoke
		StudentsGrades student1 = new StudentsGrades("Thamarai", "ECE001", mark1);
		StudentsGrades student2 = new StudentsGrades("Kannan","CSC002",mark2);
		
		//calling the display method
		student1.displayStudent();
		student2.displayStudent();


	}

}
