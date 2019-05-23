import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;

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
		underTest.closeAccount(account1);
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

}
