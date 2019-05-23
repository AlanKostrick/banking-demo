import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HighYieldCheckingTest {

	Account underTest = new HighYieldChecking("1", 1000, "Uncle Bob");

	@Test
	public void shouldHaveABeginningBalanceOf1000() {
		int checkBalance = underTest.getBalance();
		assertEquals(1000, checkBalance);
	}

	@Test
	public void shouldHaveAnAccountOwner() {
		String checkOwner = underTest.getOwner();
		assertEquals("Uncle Bob", checkOwner);
	}

	@Test
	public void shouldHaveABalanceOf1300AfterDepositOf300() {
		underTest.deposit(300);
		int checkBalance = underTest.getBalance();
		assertEquals(1300, checkBalance);
	}

	@Test
	public void shouldHaveBalanceOf900AfterWithdrawalOf100() {
		underTest.withdrawal(100);
		int checkBalance = underTest.getBalance();
		assertEquals(900, checkBalance);
	}

	@Test
	public void shouldHaveABalanceOf1000AfterWithdrawalOf1100() {
		underTest.withdrawal(1100);
		int checkBalance = underTest.getBalance();
		assertEquals(1000, checkBalance);
	}

	@Test
	public void shouldHaveABalaceOf1000AfterDepositOfNeg100() {
		underTest.deposit(-100);
		int checkBalance = underTest.getBalance();
		assertEquals(1000, checkBalance);
	}

	@Test
	public void shouldHaveABalanceOf1000AfterWithdrawalOfNeg100() {
		underTest.withdrawal(-100);
		int checkBalance = underTest.getBalance();
		assertEquals(1000, checkBalance);
	}

}
