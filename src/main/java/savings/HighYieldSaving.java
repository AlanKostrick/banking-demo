package savings;

import interfaces.Rewardable;

public class HighYieldSaving extends Saving implements Rewardable {

	public HighYieldSaving(String acctNum, int balance, String owner) {
		this.acctNum = acctNum;
		this.balance = balance;
		this.owner = owner;
	}
	
	@Override
	public void earnReward() {
		balance +=10;
	}

}
