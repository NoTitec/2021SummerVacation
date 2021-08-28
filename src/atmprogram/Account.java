package atmprogram;

public abstract class Account {
	protected String name;
	protected int number;
	protected int balance;

// ������ 
	public Account(String name) {
		this.name = (name);
		number = nextNumber();
	}

// Interface methods (note) Access private variables using public methods
	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public abstract void withdraw(int amount); // �߻�޼ҵ�

	public void showBalance() {
		System.out.println(getName() + "�� �ܰ�: " + getBalance());
	}

// static variables and helper methods
	private static int lastNumber = 0;

	private static int nextNumber() {
		return ++lastNumber;
	}

// Account�� subclass������ �����
	/*protected void setBalance(int amount) {
		balance = amount;
	}*/
}
