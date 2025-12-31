package com.inheritence;

public class CheckingAccount extends BankAccount{
    long withdrawallimit;
	public CheckingAccount(long accountNumber, double balance, long withdrawallimit) {
		super(accountNumber, balance);
		this.withdrawallimit = withdrawallimit;
	}
   @Override
    public void accountDetails() {
	// TODO Auto-generated method stub
	super.accountDetails();
	System.out.println("WithDrawallimt: "+this.withdrawallimit);
	System.out.println("Account Type  : CheckingAccount");
   }
}
