package atmSourceProgram;

public class ATM {
	private int currentAccountNumber; // current account
	private boolean userAuthenticated; 

	/* Collaborating classes */
	private Screen screen;
	private Keypad keypad;
	private Menu mainMenu;
	private BankDatabase database;
	ITransaction currentTransaction = null; // Polymorphic Composition

	public ATM() {
		userAuthenticated = false;
		currentAccountNumber = 0; // no current account number to start
		screen = new Screen();
		keypad = new Keypad();
		mainMenu = new Menu();
		database = new BankDatabase();
	}

	/* start ATM : welcome, authenticate user, perform transactions */
	public void run() {
		while ( true ) {
			screen.displayMessageLine(Message.WELCOME);       
			while ( !userAuthenticated ) { // loop while not yet authenticated
				authenticateUser();
			} 
			performTransactions(); // Do THE REQUIRED TASK

			// initializatin for next ATM session
			userAuthenticated = false; 
			currentAccountNumber = 0;
			screen.displayMessageLine(Message.GOODBYE);
		} 
   	} // run()

	// user authentication
	private boolean authenticateUser() {
		screen.displayMessage(Message.INPUT_NUMBER);
		int number = keypad.getInput();
		screen.displayMessage(Message.INPUT_PIN);
		int pin = keypad.getInput();

		userAuthenticated = database.authenticateUser( number, pin );
		if ( userAuthenticated ) {
			currentAccountNumber = number;
		} else {
		   	screen.displayMessageLine(Message.ERR_AUTH);
		}
		return userAuthenticated;
	}


	// display main menu and Execute transactios
	private void performTransactions() {
		boolean userExited = false; 
		while ( !userExited ) {     
			// (1) accepts user request (command)
			int command = mainMenu.displayMainMenu(screen, keypad);

			// (2) performs the command using DELEGATION to Transaction
			switch ( command ) {
			case Menu.BALANCE_INQUIRY: 
			case Menu.WITHDRAWAL: 
			case Menu.DEPOSIT:
				currentTransaction = createTransaction( command );
				currentTransaction.execute();
				currentTransaction = null;
				break; 
			case Menu.EXIT:
				userExited = true;
				break;
			case Menu.PROGRAM_TERMINATE:
				System.exit(0);
				break;
			default:
				screen.displayMessageLine(Message.ERR_CHOICE);
				break;
			} 
		}
	} // performTransactions()
   
	// Create transaction
	private ITransaction createTransaction( int type ) {
		ITransaction temp = null;
	   
		switch ( type ) {
		case Menu.BALANCE_INQUIRY:
			temp = new BalanceInquiry( currentAccountNumber, screen, database );
			break;
		case Menu.WITHDRAWAL:
			//temp = new Withdrawal( currentAccountNumber, screen, database, keypad );
			break; 
		case Menu.DEPOSIT:
			//temp = new Deposit( currentAccountNumber, screen, database, keypad );
			break;
		}
		return temp; 
	}
}
