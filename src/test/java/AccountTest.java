import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccountTest {

	@Test
	public void shouldHaveABeginningBalanceOf500() {
		Account underTest = new Account(500, "");
		int checkBalance = underTest.getBalance();
		assertEquals(500, checkBalance);
	}

	@Test
	public void shouldHaveAnAccountOwner() {
		Account underTest = new Account(500, "Uncle Bob");
		String checkOwner = underTest.getOwner();
		assertEquals("Uncle Bob", checkOwner);
	}

	@Test
	public void shouldHaveABalanceOf800AfterDepositOf300() {
		Account underTest = new Account(500, "Uncle Bob");
		underTest.deposit(300);
		int checkBalance = underTest.getBalance();
		assertEquals(800, checkBalance);
	}

}
