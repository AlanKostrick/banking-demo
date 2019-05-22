import java.util.HashMap;
import java.util.Map;

public class Bank {

	Map<String, Account> accounts = new HashMap<>();

	public void addAccount(Account acctToAdd) {
		accounts.put(acctToAdd.getOwner(), acctToAdd);
	}

	public int getNumAccounts() {
		return accounts.size();
	}

	public Account findAccount(String owner) {
		return accounts.get(owner);
	}

	public void closeAccount(Account acctToClose) {
		accounts.remove(acctToClose.getOwner(), acctToClose);
	}

	public void depositAll(int amtToDeposit) {
		for (Account account : accounts.values()) {
			account.deposit(amtToDeposit);
		}

	}

	public void showAllAccounts() {
		for (Account account : accounts.values()) {
			System.out.println(account.getBalance() + " " + account.getOwner());
		}
	}

}
