package jdbc.BankTransaction;

public class Account {
	 private int accountNo;
     private String name;
     private double balance;
     
     public Account() {
    	 
     }
     public Account(int accountNo,String name) {
    	 this.accountNo = accountNo;
    	 this.name = name;
    	 this.balance = 0;
     }

	 public int getAccountNo() {
		 return accountNo;
	 }

	 public void setAccountNo(int accountNo) {
		 this.accountNo = accountNo;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public double getBalance() {
		 return balance;
	 }

	 public void setBalance(double balance) {
		 this.balance = balance;
	 }
     public String toString() {
    	 return "\n------Account Details---------\nAccount No : "+getAccountNo()+"\nAccount Holder Name : "+getName()+"\nBalance(INR) : "+getBalance();
    	 		
     }
}
