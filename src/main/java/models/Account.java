package models;

public abstract class Account {

	private String acctNum;
	private int balance;
	private String owner;

	public int getBalance() {
		return balance;
	}

	public String getOwner() {
		return owner;
	}

	public String getAcctNum() {
		return acctNum;
	}

	public Account(String acctNum, int balance, String owner) {
		this.acctNum = acctNum;
		this.balance = balance;
		this.owner = owner;
	}
	
	public Account(String acctNum, String owner) {
		this.acctNum = acctNum;
		this.balance = 250;
		this.owner = owner;
	}
	
	public void increaseBalance(int amountToIncrease) {
		balance += amountToIncrease;
	}
	
	public void decreaseBalance(int amountToDecrease) {
		balance -= amountToDecrease;
	}

	public abstract void deposit(int amountToDeposit);

	public abstract void withdrawal(int amountToWithdrawal);

}
