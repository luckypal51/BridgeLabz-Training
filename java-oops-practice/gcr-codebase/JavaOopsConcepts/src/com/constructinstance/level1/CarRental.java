package com.constructinstance.level1;

public class CarRental {
	  String customerName;
	     String carModel;
	     int day;
	     
	     public CarRental() {
	    	 this("xys","normal",1);
	     }
	     public CarRental(String customerName,String carModel,int day) {
	    	 this.customerName = customerName;
	    	 this.carModel = carModel;
	    	 this.day = day;
	     }
	     
	     public CarRental(CarRental c) {
	    	 this.customerName = c.customerName;
	    	 this.carModel = c.carModel;
	    	 this.day = c.day;
	     }
	     
	     public void increaseDay(int n) {
	    	 this.day+=n;
	     }
	     public void bill() {
	    	 int amount = this.day*500;
	    	 
	    	 System.out.println("The Total amount is : "+amount);
	     }
	     public static void main(String[] args) {
	    	 CarRental h = new CarRental();
	    	 CarRental h1 = new CarRental("Lucky","Ferari",3);
	    	 
	    	 h1.bill();
	    	 
	    	 h1.increaseDay(4);
	    	 
	    	 System.out.println(h1.customerName);
	    	 System.out.println(h1.carModel);
	    	 System.out.println(h1.day);
	    	 
	    	 h1.bill();
	     }
}
