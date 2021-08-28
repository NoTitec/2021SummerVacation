package atmSourceProgram;

public class Transaction implements ITransaction{
	protected final static int CANCELED = 0; // cancal a deposit or withdraw transaction
	protected int currentAccountNumber; 	// current account 
	protected Screen screen;		// composition of a collaborating class
	protected BankDatabase database; 	// composition of a collaborating class

	public Transaction( int number, Screen screen, BankDatabase database ) {
		currentAccountNumber = number;
		this.screen = screen;
		this.database = database;
	} 

	public int getAccountNumber() { 
		return currentAccountNumber; 
	}
 
	public BankDatabase getBankDatabase() { 
		return database; 
	}

	public void execute() {
		// do nothing ( or abstract void execute(); )
	}
}
