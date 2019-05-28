package models;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.notNullValue;

import java.util.Collection;

import org.junit.Test;

import checking.HighYieldChecking;
import checking.RegularChecking;
import models.Account;
import models.Bank;
import savings.HighYieldSaving;
import savings.RegularSaving;

public class BankTest {

	Account account1 = new RegularChecking("1", 500, "Uncle Bob");
	Account account2 = new RegularChecking("2", 400, "Marty Fowler");
	Bank underTest = new Bank();

	@Test
	public void shouldAddAnAccountToTheBank() {
		underTest.addAccount(account1);
		int numAccounts = underTest.getNumAccounts();
		assertThat(numAccounts, is(1));
	}

	@Test
	public void shouldAddTwoAccountsToTheBank() {
		underTest.addAccount(account1);
		underTest.addAccount(account2);
		int numAccounts = underTest.getNumAccounts();
		assertThat(numAccounts, is(2));
		assertThat(numAccounts, is(notNullValue()));
	}

	@Test
	public void shouldReturnBalanceOf500WhenFindingAccount1() {
		underTest.addAccount(account1);
		Account acctToFind = underTest.findAccount("1");
		int foundBalance = acctToFind.getBalance();
		assertThat(foundBalance, is(500));
	}

	@Test
	public void shouldCloseAnAccountAtTheBank() {
		underTest.addAccount(account1);
		underTest.addAccount(account2);
		Account accountToClose = underTest.findAccount("2");
		underTest.closeAccount(accountToClose);
		int numAccounts = underTest.getNumAccounts();
		assertThat(numAccounts, is(1));
	}

	@Test
	public void shouldHaveBalancesOf600And500AfterDepositAllOf100() {
		underTest.addAccount(account1);
		underTest.addAccount(account2);
		underTest.depositAll(100);
		assertThat(account1.getBalance(), is(600));
		assertThat(account2.getBalance(), is(500));
	}

	@Test
	public void shouldFindAllRewardableAccounts() {
		RegularChecking account1 = new RegularChecking("1", 500, "Uncle Bob");
		HighYieldChecking account2 = new HighYieldChecking("2", 400, "Marty Fowler");
		RegularSaving account3 = new RegularSaving("3", 500, "Barb Liskov");
		HighYieldSaving account4 = new HighYieldSaving("4", 400, "Ada Lovelace");

		underTest.addAccount(account1);
		underTest.addAccount(account2);
		underTest.addAccount(account3);
		underTest.addAccount(account4);

		Collection<Account> highYieldAccounts = underTest.showAllHighYieldAccounts();
		System.out.println("High Yield Accounts: " + highYieldAccounts);
		assertThat(highYieldAccounts, containsInAnyOrder(account2, account4));
	}

}
