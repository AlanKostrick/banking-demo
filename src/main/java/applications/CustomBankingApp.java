package applications;
import java.util.Scanner;

import checking.RegularChecking;
import models.Account;

public class CustomBankingApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = input.nextLine();

		int amount = 0;

		try {
			System.out.println("How much will your account start with?");
			amount = input.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid!");
			amount = 0;
			input.nextLine();
		}

		System.out.println("How much will your account start with?");
		amount = input.nextInt();

		Account account1 = new RegularChecking("1",amount, name);
		Account account2 = new RegularChecking("2",name);

		System.out.println("Account 1: " + account1.getBalance() + " " + account1.getOwner());
		System.out.println("Account 2: " + account2.getBalance() + " " + account2.getOwner());
		input.close();
	}
}
