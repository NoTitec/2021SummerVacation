package atmSourceProgram;

public class BankDatabase {
	private Account accounts[]; // array of Accounts

	public BankDatabase() { 
		accounts = new Account[ 3 ]; 
	      	accounts[ 0 ] = new Account( 1, 11, 1000 );
	      	accounts[ 1 ] = new Account( 2, 22, 2000 );  
	      	accounts[ 2 ] = new Account( 3, 33, 3000 );  
	} 

	public int 	getBalance(int number) { return getAccount(number).getBalance(); }
	public void 	deposit(int number, int amount) { getAccount(number).deposit(amount); }
	public void 	withdraw(int number, int amount) { getAccount(number).withdraw(amount); }

	public boolean authenticateUser( int number, int pin ) {
		Account account = getAccount( number );
		return ( account != null ) ? account.validatePIN( pin ) : false;
	}

	// helper method
	private Account getAccount( int number ) {
		for ( Account account : accounts ) {
			if ( account.getAccountNumber() == number ) 
				return account;
		}
		return null;
	} 
}
