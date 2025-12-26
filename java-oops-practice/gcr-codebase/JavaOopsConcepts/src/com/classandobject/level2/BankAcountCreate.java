package com.classandobject.level2;

public class BankAcountCreate {

	public static void main(String[] args) {
	     // Creating a BankAccount object
	       BankAccount account = new BankAccount("Lynda", "123456789", 700.00);
	      
	       //Display the Bank name
	       account.displayBank();
	      
	       // Display initial balance
	       account.displayBalance();
	       // Deposit money
	       account.deposit(200.00);
	       account.displayBalance();
	       // Withdraw money
	       account.withdraw(100.00);
	       account.displayBalance();
	       // Try to withdraw more than the available balance
	       account.withdraw(900.00);


	}

}
