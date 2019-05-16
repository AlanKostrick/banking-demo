
public class Account {

	private int balance;
	private String owner;

	public int getBalance() {
		return balance;
	}

	public String getOwner() {
		return owner;
	}

	public Account(int balance, String owner) {
		this.balance = balance;
		this.owner = owner;
	}

	public void deposit(int amountToDeposit) {
		balance += amountToDeposit;
	}

}
