package savings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Account;

public class HighYieldSavingTest {

	HighYieldSaving underTest = new HighYieldSaving("1", 500, "Uncle Bob");

	@Test
	public void shouldHaveABalanceOf800AfterDepositOf300() {
		underTest.deposit(300);
		int checkBalance = underTest.getBalance();
		assertEquals(800, checkBalance);
	}

	@Test
	public void shouldHaveBalanceOf400AfterWithdrawalOf100() {
		underTest.withdrawal(100);
		int checkBalance = underTest.getBalance();
		assertEquals(400, checkBalance);
	}

	@Test
	public void shouldHaveABalanceOf510AfterImplementingAReward() {
		underTest.earnReward();
		int checkBalance = underTest.getBalance();
		assertEquals(510, checkBalance);
	}

}
