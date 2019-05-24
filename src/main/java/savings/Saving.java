package savings;

import models.Account;

public abstract class Saving extends Account {

	public Saving() {
		super();
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