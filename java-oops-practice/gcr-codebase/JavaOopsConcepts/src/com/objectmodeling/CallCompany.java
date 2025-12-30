package com.objectmodeling;

public class CallCompany {
	 public static void main(String[] args) {

	        Company company = new Company("Tech Solutions");

	        Department d1 = new Department("IT");
	        d1.addEmployee(101, "Lucky");
	        d1.addEmployee(102, "Nageshwar");

	        Department d2 = new Department("IT");
	        d2.addEmployee(201, "Himesh");

	        company.addDepartment(d1);
	        company.addDepartment(d2);

	        company.displayCompanyDetails();

	        // Deleting company
	        company.closeCompany();
	        company = null;
	    }
}
