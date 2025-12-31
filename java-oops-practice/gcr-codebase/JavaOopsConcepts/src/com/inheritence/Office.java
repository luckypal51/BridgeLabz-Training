package com.inheritence;

public class Office {
	public static void main(String[] args) {
		Employee emp = new Employee("Lucky",101,100000l);
		Manager man = new Manager("Himesh",102,1000000l,4);
		Developer dev = new Developer("Nageshwar",103,3000000l,"Python");
		Intern in = new Intern("Chirag",104,10000l,"Lucky");
		emp.displayDetails();
		man.displayDetails();
		dev.displayDetails();
		in.displayDetails();
	}
}
