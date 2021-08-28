package atmprogram;

public interface IAccount {
	String getName();
   	int getNumber();
	int getBalance();
	void deposit(int amount);
	void withdraw(int amount);
	void showBalance();
}
