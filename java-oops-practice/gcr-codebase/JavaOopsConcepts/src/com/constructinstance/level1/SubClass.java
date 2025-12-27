package com.constructinstance.level1;

public class SubClass extends University{

	public static void main(String[] args) {
		University u = new University(101,"Lucky Pal",7.48);
		u.updateCGPA(7.5);
		System.out.println(u.name);
		System.out.println(u.rollNumber);
		System.out.println();
	}

}
