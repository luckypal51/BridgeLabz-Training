package com.inheritence.Resturant;

public class Main {
   public static void main(String[] args) {
	   Chef chef = new Chef("Nageshwar",101);
	   Waiter waiter = new Waiter("Himesh",102);
	   
	   chef.performDuty();
	   waiter.performDuty();
   }
}
