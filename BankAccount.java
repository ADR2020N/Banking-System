package BankingSystem;

import java.util.Scanner;

public class BankAccount {
  int balance;
  int priviousTransaction;
  String customerName;
  String customerId;
  
  BankAccount(String cname,String cid){
	  customerName=cname;
	  customerId=cid;
  }
  
  void diposit(int amount) {
	  if(amount!=0) {
		  balance=balance+amount;
		  priviousTransaction=amount;
	  }
  }
  void withdraw(int amount) {
	  if(amount!=0) {
		  if(amount>balance) {
				 System.out.println("Insufficient Balance");
		  }else {
		  balance=balance-amount;
		  priviousTransaction=amount;
		  
		  }
	  }
		  
  }
  void priviousTransaction() {
	  if(priviousTransaction>0) {
		  System.out.println("Diposited: "+priviousTransaction);
	  }else if(priviousTransaction<0) {
		  System.out.println("Withdraw: "+Math.abs(priviousTransaction));
	  }else {
		  System.out.println("No Transaction Occured!");
	  }
  }
  void showMwnue() {
	  char option='\0';
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Welcome: "+customerName);
	  System.out.println("Your ID: "+customerId);
	  System.out.println("\n");
	  System.out.println("A.CheckBalance");
	  System.out.println("B.Deposit");
	  System.out.println("C.Withdraw");
	  System.out.println("D.PriviousTransaction");
	  System.out.println("E.Exit");
	  do {
		  System.out.println("______________________________");
		  System.out.println("Enter Your Option");
		  System.out.println("______________________________");
		  System.out.print("\n");
		  option=sc.next().charAt(0);
		  System.out.print("\n");
		switch (option) {
		case 'A':
			System.out.println("___________________________");
			System.out.println("Balance: "+balance);
			System.out.println("___________________________");
			System.out.print("\n");
			break;
		case 'B':
			System.out.println("___________________________");
			System.out.println("Enter Diposit Amount");
			System.out.print("\n");
			int amountDiposit=sc.nextInt();
			diposit(amountDiposit);
			System.out.print("\n");
			break;
		case 'C':
			System.out.println("___________________________");
			System.out.println("Enter Withdraw Amount");
			System.out.print("\n");
			int amountWithdraw=sc.nextInt();
			withdraw(amountWithdraw);
			System.out.print("\n");
			break;
		case 'D':
			System.out.println("___________________________");
			priviousTransaction();
			System.out.println("___________________________");
			System.out.print("\n");
			break;
		case 'E':
			System.out.print("\n___________________________");
			break;
		default:
			System.out.println("\nInvalid Option:Try Again");
			break;
		}
	  }while(option!=0);
	  System.out.print("Thank For Using Our System");
  }
  
}
