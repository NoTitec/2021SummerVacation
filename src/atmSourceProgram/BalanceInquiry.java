package atmSourceProgram;

public class BalanceInquiry extends Transaction {
	public BalanceInquiry( int number, Screen screen, BankDatabase database ) {
		super( number, screen, database );
	}

	// performs the task of balance inquiry
	public void execute() {
		screen.displayMessageLine( Message.BALANCE 
			+ getBankDatabase().getBalance( getAccountNumber() ));
	} 
}
