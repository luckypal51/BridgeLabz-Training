package com.objectmodeling;

public class Caller {
	 public static void main(String[] args) {

	        Bank bank = new Bank("State Bank of India");

	        Customer1 c1 = new Customer1("Lucky");
	        Customer1 c2 = new Customer1("Rahul");

	        bank.openAccount(c1, 101, 5000);
	        bank.openAccount(c1, 102, 12000);
	        bank.openAccount(c2, 201, 8000);

	        c1.viewBalance();
	        c2.viewBalance();
	    }
}
