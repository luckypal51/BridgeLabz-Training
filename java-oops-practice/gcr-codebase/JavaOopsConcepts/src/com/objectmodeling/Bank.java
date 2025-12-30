package com.objectmodeling;

import java.util.ArrayList;

public class Bank {
	 private String bankName;
	    private ArrayList<Customer1> customers = new ArrayList<>();

	    public Bank(String bankName) {
	        this.bankName = bankName;
	    }

	    public String getBankName() {
	        return bankName;
	    }

	    public void openAccount(Customer1 customer, int accNo, double balance) {
	        Account account = new Account(accNo, balance, this);
	        customer.addAccount(account);

	        if (!customers.contains(customer)) {
	            customers.add(customer);
	        }

	        System.out.println("Account opened for " + customer + " in " + bankName);
	    }
}
