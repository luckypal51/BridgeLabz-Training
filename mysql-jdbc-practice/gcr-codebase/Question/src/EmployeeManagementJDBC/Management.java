package EmployeeManagementJDBC;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Management {
    private Connection con;
    public Management() {
    	try {
    		con = SingletonConnection.getInstance().getConnection();
    	}catch(Exception e) {
    		System.out.println("Connection Failed !!");
    	}
    }
    
    public void addEmployee(Employee emp) {
    	String addquery = "Insert Into employee(id,name,salary,contact,email) values(?,?,?,?,?);";
    	try {
    		PreparedStatement per = con.prepareStatement(addquery);
    		per.setInt(1,emp.getId());
    		per.setString(2,emp.getName());
    		per.setDouble(3,emp.getSalary());
    		per.setString(4,emp.getContact());
    		per.setString(5,emp.getEmail());
    		int update = per.executeUpdate();
    		System.out.println("Row Affected "+update+" Insert Successfully");
    	}catch(Exception e) {
    		System.out.println("Insertion Failed !! "+e.getMessage());
    	}
    }
    public void viewAll() {
    	String all = "Select * From employee;";
    	try {
         Statement stm = con.createStatement();
         ResultSet res = stm.executeQuery(all);
         System.out.println("Table Records ->");
         while(res.next()) {
        	 Employee emp = new Employee(res.getInt(1),res.getString(2),res.getDouble(3), res.getString(4),res.getString(5));
        	 System.out.println(emp.toString());
         }
    	}catch(Exception e) {
    		
    	}
    }
     
    public void updateSalary(double salary, int id) throws SQLException {
    	String query = "Update employee set salary = "+salary+" where id = "+id+";";
    	 try{
    		 Statement stm = con.createStatement();
    		 int update = stm.executeUpdate(query);
    	     System.out.println("Rows affected "+update+" Successfull");
    	 }catch(Exception e) {
    		 System.out.println(e.getMessage());
    	 }
    	
    }
    public void deleteEmployee(int id) throws SQLException{
    	try {
    		String query = "delete from employee where id ="+id;
        	Statement stm = con.createStatement();
        	boolean del = stm.execute(query);
        	System.out.println("Deletion successfull : "+del);
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
      public void findByName(String name) {
	    try {
	    	String query = "select * from employee where name = ?";
	    	PreparedStatement per = con.prepareStatement(query);
	    	per.setString(1,name);
	    	ResultSet res = per.executeQuery();
	    	System.out.println("Employee with name : "+name);
	    	while(res.next()) {
	    		 Employee emp = new Employee(res.getInt(1),res.getString(2),res.getDouble(3), res.getString(4),res.getString(5));
	        	 System.out.println(emp.toString());
	    	}
	    }catch(Exception e) {
	    	System.out.println(e.getMessage());
	    }
     }
}
