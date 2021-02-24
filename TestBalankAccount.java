package BankingSystem;

import java.util.Scanner;

public class TestBalankAccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Your Id: ");
		String id=sc.nextLine();
		BankAccount bnkAc=new BankAccount(name,id);
		System.out.print("\n");
		bnkAc.showMwnue();

	}

}
