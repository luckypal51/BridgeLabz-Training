package com.inheritence;

public class SavingsAccount extends BankAccount{
    float interestRate;
	public SavingsAccount(long accountNumber, double balance,float interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
   @Override
    public void accountDetails() {
	  super.accountDetails();
	  System.out.println("InterestRate  : "+this.interestRate);
	  System.out.println("Account Type  : SavingsAccount");
    }
}
