package com.inheritence;

public class Manager extends Employee {
	public int teamSize;
      public Manager(String name,int empId,float salary,int teamSize){
    	         super(name,empId,salary);
    	         this.teamSize = teamSize;
    	  }
      
    	@Override
    	public void displayDetails() {
    		 System.out.println("----Employee Details-----");
        	 System.out.println("Name     : "+this.name);
        	 System.out.println("Id       : "+this.empId);
        	 System.out.println("Salary   : "+this.salary);
        	 System.out.println("TeamSize : "+this.teamSize);
    	} 
    	 
      
}
