package atmprogram;

public class MinusAccount extends AccountAdapter {
	private int limit;

	public MinusAccount(String name, int limit) {
		super(name);
		this.limit = limit;
	}
	public void withdraw(int amount) {
		if (amount <= balance + limit) balance -= amount;
	}
}
