package Assignment1;

import java.util.Scanner;

//Design a console-based Bank Management Program in Java that allows a user to create a 
//bank account and perform basic banking operations such as deposit, withdrawal, balance 
//enquiry, and account details display. The program should handle exceptions as required.

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
class BankAccount{
	private String accountHolder;
	private int accountNumber;
	private double balance;
	
	BankAccount(String name, int accNo, double bal){
		accountHolder = name;
		accountNumber = accNo;
		balance = bal;
	}
	
	void deposite(double amount) throws IllegalArgumentException{
		if(amount <= 0) {
			throw new IllegalArgumentException("Deposite amount must be positive.");
		}
		
		balance += amount;
		System.out.println("Amount deposited successfully. ");
	}
	
	void withdraw(double amount) throws InsufficientBalanceException{
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance.");
		}
		
		balance -= amount;
		System.out.println("Amount withdrawn successfully.");
	}
	
	void checkBalance() {
		System.out.println("Current Balance: $" + balance);
	}
	
	void displayDetails() {
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : $" + balance);
	}
}

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("---- Create Bank Account -----");
		System.out.print("Enter Account Holder Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Account Number : ");
		int AccNo = sc.nextInt();
		
		System.out.print("Enter Initial Balance : ");
		double bal = sc.nextDouble();
		
		BankAccount account = new BankAccount(name, AccNo, bal);
		
		int choice;
		
		do {
			System.out.println("-------- Bank Menu ------");
			System.out.println("1. Deposite ");
			System.out.println("2. Withdraw ");
			System.out.println("3. Balance Enquiry ");
			System.out.println("4. Display Account Details ");
			System.out.println("5. Exit ");
			System.out.println("Enter choice : ");
			
			choice = sc.nextInt();
			
			try {
				switch(choice) {
				case 1: 
					System.out.print("Enter deposite amount: ");
					double dep = sc.nextDouble();
					account.deposite(dep);
					break;
					
				case 2:
					System.out.print("Enter withdrawal amount : ");
					double wd = sc.nextDouble();
					account.withdraw(wd);
					break;
					
				case 3: 
					account.checkBalance();
					break;
					
				case 4:
					account.displayDetails();
					break;
					
				case 5:
					System.out.print("Thank you for using Bank Management System.");
					break;
					
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			}
			catch(InsufficientBalanceException | IllegalArgumentException e) {
				System.out.println("Error : " + e.getMessage());
			}
		}
		
		while(choice != 5);
	}
}
