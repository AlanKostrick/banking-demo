package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import interfaces.Rewardable;

public class Bank {

	Map<String, Account> accounts = new HashMap<>();

	public void addAccount(Account acctToAdd) {
		accounts.put(acctToAdd.getAcctNum(), acctToAdd);
	}

	public int getNumAccounts() {
		return accounts.size();
	}

	public Account findAccount(String acctNum) {
		return accounts.get(acctNum);
	}

	public void closeAccount(Account acctToClose) {
		accounts.remove(acctToClose.getAcctNum());
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

	public Collection<Account> showAllHighYieldAccounts() {
		Collection<Account> highYieldAccounts = new ArrayList<>();
		for (Account account : accounts.values()) {
			if (account instanceof Rewardable) {
				highYieldAccounts.add(account);
			}
		}
		return highYieldAccounts;
	}

}
