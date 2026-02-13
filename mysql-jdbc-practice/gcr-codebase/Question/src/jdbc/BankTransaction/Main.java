package jdbc.BankTransaction;

import java.util.Scanner;

public class Main {
  public static void main(String [] args) {
	  Scanner sc = new Scanner(System.in);
	  Bank bank = new Bank();
	  while(true) {
		  System.out.println("Enter 1 to open account      :");
		  System.out.println("Enter 2 to view account      :");
		  System.out.println("Enter 3 to add amount        :");
		  System.out.println("Enter 4 to withdrawal amount :");
		  System.out.println("Enter 5 to transfer money    :");
		  int a = sc.nextInt();
		  if(a==1) {
			  System.out.println("Enter the account number :");
			  int acc = sc.nextInt();
			  sc.nextLine();
			  System.out.println("Enter the name           :");
			  String name = sc.nextLine();
			  Account ac = new Account(acc, name);
			  bank.addAccount(ac);
		  }else if(a==2) {
			  System.out.println("Enter the account number :");
			  int acc = sc.nextInt();
			  Account ac = bank.getAccount(acc);
			  if(ac!=null) {
				  System.out.println(ac.toString());
			  }
		  }else if(a==3) {
			  System.out.println("Enter the account number :");
			  int acc = sc.nextInt();
			  System.out.println("Enter the amount         :");
			  double amount = sc.nextDouble();
			  bank.addAmount(acc, amount);
		  }else if(a==4) {
			  System.out.println("Enter the account number :");
			  int acc = sc.nextInt();
			  System.out.println("Enter the amount         :");
			  double amount = sc.nextDouble();
			  bank.withdrawal(acc, amount);
		  }else if(a==5) {
			  System.out.println("Enter your account number:");
			  int send = sc.nextInt();
			  System.out.println("Enter reciver account no :");
			  int recive = sc.nextInt();
			  System.out.println("Enter the amount         :");
			  double amount = sc.nextDouble();
			  bank.transferAmount(send, recive, amount);
		  }else {
			  break;
		  }
	  }
  }
}
