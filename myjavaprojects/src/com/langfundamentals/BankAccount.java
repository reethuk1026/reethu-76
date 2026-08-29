package com.langfundamentals;
import java.util.Scanner;

public class BankAccount {
	
	double balance = 5000.00; //instance variable

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		
		
		BankAccount ba = new BankAccount();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amount to deposit: ");
		double amount = sc.nextDouble();
		ba.deposit(amount);

		System.out.println("Enter Withdrawal Amount: ");
		double WA = sc.nextDouble();
		ba.withdraw(WA);
		
//		ba.checkBalance();	
		
		System.out.println("Main Method Ended");
	
	}
	
	void withdraw(double WA) {
		
		if(WA<=balance) {
			
			balance = balance - WA;	
			checkBalance();
			
		}else {
			System.out.println("Insufficient Balance in your Account: ");
			checkBalance();
		}
		
	}
	void checkBalance() {
		
		System.out.println("The current Balance is: " + balance);
	}
	
	void deposit(double amount) { //instance method
		
		if(amount>0) {
			
			balance = balance + amount;
			checkBalance();
			
		}else {
			
			System.out.println("Invalid amount to deposit: ");
			checkBalance();
		}
		
		
	}

}
