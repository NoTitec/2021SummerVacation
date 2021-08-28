package atmprogram;

public class AccountAdapter implements IAccount {
	private String name;
	private int number;
	protected int balance;

	public AccountAdapter(String name) {
		this.name = (name);
		number = nextNumber();
	}

	// 인터페이스 구현
	public String getName() {
		return name;
	} // (주의) 접근변경자는 public.

	public int getNumber() {
		return number;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		// empty body – 상속시 재정의한다.
	}

	public void showBalance() {
		System.out.println(name + " 의 잔고: " + balance);
	}

	// 정적변수와 help 메소드
	private static int lastNumber = 0;

	private static int nextNumber() {
		return ++lastNumber;
	}
}
