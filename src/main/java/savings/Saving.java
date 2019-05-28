package savings;

import models.Account;

public abstract class Saving extends Account {

	public Saving(String acctNum, int balance, String owner) {
		super(acctNum, balance, owner);
	}

	@Override
	public void deposit(int amountToDeposit) {
		if (amountToDeposit < 0) {
			this.increaseBalance(0);
		} else {
			this.increaseBalance(amountToDeposit);
		}
	}

	@Override
	public void withdrawal(int amountToWithdrawal) {
		if (amountToWithdrawal < 0 || amountToWithdrawal > this.getBalance()) {
			this.decreaseBalance(0);
			System.out.println("Insufficient funds!");
		} else {
			this.decreaseBalance(amountToWithdrawal);
		}
	}

}