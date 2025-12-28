package com.constructinstance.level1;

public class SavingsAccount extends BankAccount{
        
	public SavingsAccount(long a,String n, long b) {
		super(a,n,b);
	}
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(1233l,"Lucky",5000l);
		sa.setBalance(1000000l);
		System.out.println(sa.getBalance());
	}
}
