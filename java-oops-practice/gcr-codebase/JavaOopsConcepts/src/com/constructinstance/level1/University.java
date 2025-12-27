package com.constructinstance.level1;

public class University {
	public int rollNumber;
	protected String name;
	private double cgpa;
	
	public University() {
	}
	public University(int rollNumber,String name, double cgpa) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.cgpa = cgpa;
	}
	public void updateCGPA(double cgpa) {
		this.cgpa = cgpa;
		System.out.println(this.cgpa);
	}
	public double getCGPA() {
		return this.cgpa;
	}
}
