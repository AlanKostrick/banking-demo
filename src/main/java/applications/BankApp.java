package applications;
import java.util.Scanner;

import checking.RegularChecking;
import models.Account;
import models.Bank;

public class BankApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Bank myBank = new Bank();
		
		Account uncleBob = new RegularChecking("1",500, "Uncle Bob");
		Account marty = new RegularChecking("2",400, "Marty Fowler");
		Account barb = new RegularChecking("3","Barb Liskov");
		
		myBank.addAccount(uncleBob);
		myBank.addAccount(marty);
		myBank.addAccount(barb);
		
		System.out.println("You are the bank teller.");
		System.out.println("Here are the accounts at WCCI Bank");
		myBank.showAllAccounts();
		
		String userChoice;
		
		System.out.println("Press 1 to make a deposit to a specific acct");
		userChoice = input.nextLine();
		
		if(userChoice.equals("1")) {
			System.out.println("Which account do you want to deposit into?");
			String owner = input.nextLine();
			Account acctToFind = myBank.findAccount(owner);
			System.out.println("How much to you want to deposit?");
			int amtToDeposit = input.nextInt();
			acctToFind.deposit(amtToDeposit);
			System.out.println("Thank You!");
		}
		
		showStats(myBank);
		

	}

	private static void showStats(Bank myBank) {
		System.out.println("Updated account info");
		myBank.showAllAccounts();
	}

}
