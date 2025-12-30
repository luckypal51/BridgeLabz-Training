package com.objectmodeling;

import java.util.ArrayList;

public class Customer1 {
	 private String name;
	    private ArrayList<Account> accounts = new ArrayList<>();

	    public Customer1(String name) {
	        this.name = name;
	    }

	    public void addAccount(Account account) {
	        accounts.add(account);
	    }

	    public void viewBalance() {
	        System.out.println("Customer: " + name);
	        for (Account acc : accounts) {
	            System.out.println(
	                "Bank: " + acc.getBank().getBankName() +
	                " | Balance: " + acc.getBalance()
	            );
	        }
	    }
}
