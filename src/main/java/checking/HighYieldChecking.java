package checking;

import interfaces.Rewardable;

public class HighYieldChecking extends Checking implements Rewardable {

	public HighYieldChecking(String acctNum, int balance, String owner) {
		super(acctNum, balance, owner);
	}

	@Override
	public void earnReward() {
		this.increaseBalance(10);
	}

}
