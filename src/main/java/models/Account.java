package models;

public abstract class Account {

	protected int balance;
	protected String owner;
	protected String acctNum;

	public int getBalance() {
		return balance;
	}

	public String getOwner() {
		return owner;
	}

	public String getAcctNum() {
		return acctNum;
	}

	public abstract void deposit(int amountToDeposit);

	public abstract void withdrawal(int amountToWithdrawal);

}
