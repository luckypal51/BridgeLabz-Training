package com.objectmodeling;
import java.util.ArrayList;

class Company {
    private String companyName;
    private ArrayList<Department> departments = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.display();
        }
    }

    
    public void closeCompany() {
        departments.clear(); 
        System.out.println("Company closed. All departments and employees removed.");
    }
}
