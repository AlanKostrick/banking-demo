import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Account account1 = new Account(500, "Uncle Bob");

		System.out.println("Hello welcome to Bank Of WCCI");

		String userChoice = "";

		do {
			System.out.println("Press 1 to check balance");
			System.out.println("Press 2 to make a deposit");
			System.out.println("Press 9 to exit");
			userChoice = input.nextLine();

			if (userChoice.equals("9")) {
				break;
			}

			if (userChoice.equals("1")) {
				System.out.println("Your balance is $" + account1.getBalance() + "\n");
			} else if (userChoice.equals("2")) {
				System.out.println("How much money do you want to deposit?");
				int amountToDeposit = input.nextInt();
				account1.deposit(amountToDeposit);
				input.nextLine(); // allows for user input spacing
			} else {
				System.out.println("I'm sorry I don't understand your response.");
			}
		} while (!userChoice.equals("9"));

		System.out.println("Thanks for banking with us today!");
		input.close();
	}
}
