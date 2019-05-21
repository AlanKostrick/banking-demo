import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccountTest {

	Account underTest = new Account(500, "Uncle Bob");

	@Test
	public void shouldHaveABeginningBalanceOf500() {
		int checkBalance = underTest.getBalance();
		assertEquals(500, checkBalance);
	}

	@Test
	public void shouldHaveAnAccountOwner() {
		String checkOwner = underTest.getOwner();
		assertEquals("Uncle Bob", checkOwner);
	}

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
	public void shouldHaveABalanceOf500AfterWithdrawalOf600() {
		underTest.withdrawal(600);
		int checkBalance = underTest.getBalance();
		assertEquals(500, checkBalance);
	}

	@Test
	public void shouldHaveABalaceOf500AfterDepositOfNeg100() {
		underTest.deposit(-100);
		int checkBalance = underTest.getBalance();
		assertEquals(500, checkBalance);
	}

	@Test
	public void shouldHaveABalanceOf500AfterWithdrawalOfNeg100() {
		underTest.withdrawal(-100);
		int checkBalance = underTest.getBalance();
		assertEquals(500, checkBalance);
	}

	@Test
	public void shouldHaveADefaultBalanceOf250WhenOpeningAnAccount() {
		Account underTest2 = new Account("Uncle Bob");
		int checkBalance = underTest2.getBalance();
		assertEquals(250, checkBalance);
	}

}
