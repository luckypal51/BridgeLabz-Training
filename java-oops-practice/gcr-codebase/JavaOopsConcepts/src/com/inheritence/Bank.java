package com.inheritence;

public class Bank {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(10245l,15000,15f);
		CheckingAccount ca = new CheckingAccount(10245l,14025,1000l);
		FixedDepositAccount fda = new FixedDepositAccount(10245l,78000,10);
		
		sa.accountDetails();
		ca.accountDetails();
		fda.accountDetails();
	}
}
