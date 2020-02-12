/*
Name: Denny Feng
Task: ATM Simulator 
Description: Create a basic banking ATM simulator where a customer can create account, deposit, withdraw money from their account. 
*/

import java.time.LocalDate;
import java.util.Scanner;

public class ATM7739 {
	public static void main(String[] args) {
		//Part 1 of Assignment
		Account myAccount = new Account(); 
		
		System.out.println("Part 1 of Assignment: ");
		myAccount.setId(1122);
		myAccount.setBalance(20000);
		myAccount.setAnnualInterestRate(4.5);
		myAccount.withdraw(2500);
		myAccount.deposit(3000);
		
		System.out.println("Balance is: " + myAccount.getBalance());
		System.out.println("Monthly Interest Rate is: " + myAccount.getMonthlyInterestRate());
		System.out.println("Monthly Amount from Interest is: " + myAccount.getMonthlyInterest());

		LocalDate date = LocalDate.now(); 
		System.out.println("Account created on: " + date); 
		System.out.println();
		System.out.println();
		
		
		
		//Part 2 of Assignment - 
		System.out.println("Part 2 of Assignemnt: ");
		Account customer = new Account(1);
		customer.showMenu();
		
	}
	
	

	static class Account {
		double balance; 
		int idnumber = 1; 
		double annualInterestRate;
		double monthlyrate;
		LocalDate dateCreated; 
		
		public Account() {
			idnumber = 1001; 
			balance = 0; 
			annualInterestRate = 0.08;
			dateCreated = null; 
		}
		
		void setId(int setidnumber) {
			idnumber = setidnumber;
		}
		
		int getId() {
			return idnumber; 
		}
		
		double getBalance() {
			return balance; 
		}
		
		void setBalance(double balanceinput) {
			balance = balanceinput; 
		}
		
		double getAnnualInterestRate() {
			return annualInterestRate;
		}
		
		void setAnnualInterestRate(double rate) {
			annualInterestRate = rate; 
		}
		
		double getMonthlyInterestRate() {
			monthlyrate = annualInterestRate/100/12; 
			return monthlyrate; 
			}

			double getMonthlyInterest() {
			double monthlyinterestamount;
			monthlyinterestamount = monthlyrate * balance;
			return monthlyinterestamount;	 
			}
		
		
		Account(int idnumber){
			
		}
		
		void deposit(double amount) {
			if(amount > 0) {
				balance = balance + amount; 
			}
			else {
				System.out.println("You cannot deposit zero or negative dollars. Please try again.");
			}
		}
		
		void withdraw(double amount) {
			if(amount > 0 && amount < balance) {
				balance = balance - amount;
			}
			else {
				System.out.println("Error. Insufficient funds, or invalid number. Please try again.");
			}
		}
		
		void showMenu() {
			int option = 0;
			balance = 100; 
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Welcome to Denny Bank ATM.");
			System.out.println("Enter your id number: ");
			idnumber = scan.nextInt(); 
			while(idnumber > 10 || idnumber < 0) {
				System.out.println("Invalid id number. Must be between 0 and 10");
				System.out.println("Enter your id number: ");
				idnumber = scan.nextInt();
			}
			System.out.println("Your user id number is: " + idnumber);
			System.out.println();
			System.out.println("1. Check your current balance.");
			System.out.println("2. Make a deposit.");
			System.out.println("3. Make a withdrawal.");
			System.out.println("4. Exit.");
			
			
			do {
				System.out.println("Enter your selection: ");
				option = scan.nextInt();//.charAt(0); 
				System.out.println(); 
				
				switch(option) {
				case 1: 
					System.out.println("Your current balance is: " + balance);
					System.out.println(); 
					break; 
					
				case 2:
					System.out.println("Enter deposit amount: ");
					double depositamount = scan.nextDouble();
					deposit(depositamount);
					System.out.println();
					break;
					
				case 3:
					System.out.println("Enter a withdrawal amount: ");
					double withdrawamount = scan.nextDouble(); 
					withdraw(withdrawamount);
					System.out.println();
					break;
					
				case 4:
					System.out.println("Thank you for using Denny Bank ATM.");
					System.exit(0);
					
					default:
						System.out.println("Please enter a valid option...");
						break; 
				}
			} while (option != 4);
		}
	}
}
