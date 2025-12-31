package com.inheritence;

public class FixedDepositAccount extends BankAccount{
    int time;
	public FixedDepositAccount(long accountNumber, double balance,int time) {
		super(accountNumber, balance);
		this.time = time;
		// TODO Auto-generated constructor stub
	}
     @Override
    public void accountDetails() {
    	// TODO Auto-generated method stub
    	super.accountDetails();
    	System.out.println("Time          : "+this.time);
    	System.out.println("Account Type  : Fixed Deposit Account");
    }
}
