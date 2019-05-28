package savings;

import interfaces.Rewardable;

public class HighYieldSaving extends Saving implements Rewardable {

	public HighYieldSaving(String acctNum, int balance, String owner) {
		super(acctNum, balance, owner);
	}

	@Override
	public void earnReward() {
		this.increaseBalance(10);
	}

}
