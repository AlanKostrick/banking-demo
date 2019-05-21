
public class Account {

	private int balance;
	private String owner;

	public int getBalance() {
		return balance;
	}

	public String getOwner() {
		return owner;
	}

	//Overloaded constructors
	public Account(int balance, String owner) {
		this.balance = balance;
		this.owner = owner;
	}

	public Account(String owner) {
		this.balance = 250; // default account value
		this.owner = owner;
	}

	public void deposit(int amountToDeposit) {
		if (amountToDeposit < 0) {
			balance += 0;
		} else {
			balance += amountToDeposit;
		}
	}

	public void withdrawal(int amountToWithdrawal) {
		if (amountToWithdrawal < 0 || amountToWithdrawal > balance) {
			balance -= 0;
			System.out.println("Insufficient funds!");
		} else {
			balance -= amountToWithdrawal;
		}
	}

}
