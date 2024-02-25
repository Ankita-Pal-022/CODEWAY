package com.wipro.test;

import java.util.Scanner;


class A {
 private Account bankAccount;
 private Scanner scanner;

 public A(Account bankAccount) {
     this.bankAccount = bankAccount;
     scanner = new Scanner(System.in);
 }

 public void displayOptions() {
     System.out.println("Welcome to the ATM!");
     System.out.println("1. Withdraw");
     System.out.println("2. Deposit");
     System.out.println("3. Check Balance");
     System.out.println("4. Exit");
 }

 public void run() {
     while (true) {
         displayOptions();
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter the amount to withdraw: ");
                 double withdrawAmount = scanner.nextDouble();
                 double withdrawn = bankAccount.withdraw(withdrawAmount);
                 if (withdrawn != -1) {
                     System.out.println("Withdrawal successful. Remaining balance: " + withdrawn);
                 }
                 break;
             case 2:
                 System.out.print("Enter the amount to deposit: ");
                 double depositAmount = scanner.nextDouble();
                 double deposited = bankAccount.deposit(depositAmount);
                 System.out.println("Deposit successful. New balance: " + deposited);
                 break;
             case 3:
                 System.out.println("Your balance is: " + bankAccount.checkBalance());
                 break;
             case 4:
                 System.out.println("Thank you for using the ATM!");
                 return;
             default:
                 System.out.println("Invalid choice. Please try again.");
                 break;
         }
     }
 }
}

class Account {
	 private double balance;

	 public Account(double balance) {
	     this.balance = balance;
	 }

	 public double deposit(double amount) {
	     balance += amount;
	     return balance;
	 }

	 public double withdraw(double amount) {
	     if (balance >= amount) {
	         balance -= amount;
	         return balance;
	     } else {
	         System.out.println("Insufficient funds");
	         return -1; // indicates failure
	     }
	 }

	 public double checkBalance() {
	     return balance;
	 }
	}


public class Main {
 public static void main(String[] args) {
     Account account = new Account(0); // Starting balance is 1000
     A atm = new A(account);
     atm.run();
 }
}
