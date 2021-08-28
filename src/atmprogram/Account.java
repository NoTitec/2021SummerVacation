package atmprogram;

public abstract class Account {
	protected String name;
	protected int number;
	protected int balance;

// 생성자 
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

	public abstract void withdraw(int amount); // 추상메소드

	public void showBalance() {
		System.out.println(getName() + "의 잔고: " + getBalance());
	}

// static variables and helper methods
	private static int lastNumber = 0;

	private static int nextNumber() {
		return ++lastNumber;
	}

// Account의 subclass에서만 사용함
	/*protected void setBalance(int amount) {
		balance = amount;
	}*/
}
