package checking;
public class RegularChecking extends Checking {

	public RegularChecking(String acctNum, int balance, String owner) {
		super(acctNum, balance, owner);
	}

	public RegularChecking(String acctNum, String owner) {
		super(acctNum, owner);
		//this.balance = 250;
	}

}
