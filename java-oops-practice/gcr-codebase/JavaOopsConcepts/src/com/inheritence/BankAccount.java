package com.inheritence;

public class BankAccount {
      long accountNumber;
      double balance;
	
      public BankAccount(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	  }
      public void accountDetails() {
    	  System.out.println(" ");
    	  System.out.println("---------Account Details--------");
    	  System.out.println("Account No    : "+this.accountNumber);
    	  System.out.println("Balance       : "+this.balance);
      }
}
