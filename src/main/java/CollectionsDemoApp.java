import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CollectionsDemoApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Account account1 = new Account(500, "Uncle Bob");
		Account account2 = new Account(400, "Marty Fowler");
		Account account3 = new Account("Barb Liskov");

		System.out.println("Array Demo");
		Account[] accountsArray = { account1, account2, account3 };

		for (Account account : accountsArray) {
			System.out.println(account.getBalance() + " " + account.getOwner());
		}

		// would have to create a new and updated array
		Account[] updatedAccountsArray = { account1, account2 };

		System.out.println("Array List Demo:");
		List<Account> accountsList = new ArrayList<>(); // declare

		// build
		accountsList.add(account1); // idx 0
		accountsList.add(account2); // idx 1
		accountsList.add(account3); // idx 2
		// accountsList.remove(account1);

		// iterating over the collection to do SOMETHING
		for (Account account : accountsList) {
			System.out.println(account.getBalance() + " " + account.getOwner());
		}

		// iterating over the collection to SEARCH for Uncle Bob
		for (int i = 0; i < accountsList.size(); i++) {
			if (accountsList.get(i).getOwner().equals("Uncle Bob")) {
				System.out.println("This occurs at position " + i);
			}
		}

		System.out.println("Maps Demo");
		Map<String, Account> accountsMap = new HashMap<>();

		accountsMap.put("Uncle Bob", account1);
		accountsMap.put(account2.getOwner(), account2);
		accountsMap.put(account3.getOwner(), account3);

		System.out.println("Which account do you want to access?");
		String ownerName = input.nextLine();

		Account accountToFind = accountsMap.get(ownerName);

		System.out.println(accountToFind.getBalance() + " " + accountToFind.getOwner());

	}

}
