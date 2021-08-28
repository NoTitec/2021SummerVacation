package atmprogram;

public class NormalAccount extends AccountAdapter {
	public NormalAccount(String name) {
		super(name);
	}
	public void withdraw(int amount) {
		if (amount <= balance) balance -= amount;
	}
}
