package checking;
import models.Account;

public abstract class Checking extends Account {

	public Checking(String acctNum, int balance, String owner) {
		this.acctNum = acctNum;
		this.balance = balance;
		this.owner = owner;
	}

	public Checking(String acctNum, String owner) {
		this.acctNum = acctNum;
		this.owner = owner;
	}

	@Override
	public void deposit(int amountToDeposit) {
		if (amountToDeposit < 0) {
			balance += 0;
		} else {
			balance += amountToDeposit;
		}
	}

	@Override
	public void withdrawal(int amountToWithdrawal) {
		if (amountToWithdrawal < 0 || amountToWithdrawal > balance) {
			balance -= 0;
			System.out.println("Insufficient funds!");
		} else {
			balance -= amountToWithdrawal;
		}
	}

}