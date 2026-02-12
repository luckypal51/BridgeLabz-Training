package EmployeeManagementJDBC;

import java.sql.SQLException;
import java.util.*;


public class Main {
     public static void main(String[] args) {
    	 Management manage = new Management();
    	 Scanner sc = new Scanner(System.in);
    	
      	 System.out.println("------Welcome to employee store------");
    	 while(true) {
    		 System.out.println("\nEnter 1 to add Employee");
    		 System.out.println("Enter 2 to view all records");
    		 System.out.println("Enter 3 to update salary");
    		 System.out.println("Enter 4 to delete employee");
    		 System.out.println("Enter 5 to search employee by name \n");
    		 int a = sc.nextInt();
    		 sc.nextLine();
    		 if(a==1) {
    			 System.out.println("Enter id :");
    			 int id = sc.nextInt();
    			 sc.nextLine();
    			 System.out.println("Enter name :");
    			 String name = sc.nextLine();
    			 System.out.println("Enter salary :");
    			 double salary = sc.nextDouble();
    			 sc.nextLine();
    			 System.out.println("Enter contact :");
    			 String contact = sc.nextLine();
    			 System.out.println("Enter email :");
    			 String email = sc.nextLine();
    			 Employee emp = new Employee(id,name,salary,contact,email);
    			 manage.addEmployee(emp);
    		 }else if(a==2) {
    			 manage.viewAll();
    		 }else if(a==3) {
    			 System.out.println("Enter the id of employee");
    			 int id = sc.nextInt();
    			 System.out.println("Enter salary :");
    			 double amount = sc.nextDouble();
    			 try {
					manage.updateSalary(amount, id);
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
    		 }else if(a==4) {
    			 System.out.println("Enter id of employee ");
    			 int id = sc.nextInt();
    			 try {
					manage.deleteEmployee(id);
				} catch (SQLException e) {
				    System.out.println("Employee not deleted ");
				}
    		 }else if(a==5) {
    			 System.out.println("Enter the name ");
    			 String name = sc.nextLine();
    			 manage.findByName(name);
    		 }else {
    			 System.out.println("thank you for comming");
    			 break;
    		 }
    	 }
     }
}
