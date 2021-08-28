package atmprogram;

public class Atmmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAccount hongAccount, kimAccount;

		hongAccount = new NormalAccount("gdhong");
		hongAccount.showBalance();

		kimAccount = new MinusAccount("gdKim", 5000000);
		kimAccount.showBalance();

		hongAccount.deposit(10000);
		hongAccount.showBalance();
		kimAccount.deposit(10000);
		kimAccount.showBalance();

		hongAccount.withdraw(50000);
		hongAccount.showBalance();
		kimAccount.withdraw(50000);
		kimAccount.showBalance();
	}

}
