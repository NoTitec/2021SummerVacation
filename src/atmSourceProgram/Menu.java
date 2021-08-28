package atmSourceProgram;

public class Menu {
	public static final int BALANCE_INQUIRY = 1;
	public static final int WITHDRAWAL = 2;
	public static final int DEPOSIT = 3;
	public static final int EXIT = 4;
	public static final int PROGRAM_TERMINATE = 5;

	// display main menu and get user command
	public int displayMainMenu(Screen screen, Keypad keypad) {
		screen.displayMessageLine( "\n\t\t     MENU:\n" );
		screen.displayMessageLine( "\t\t1 - Inquiry balance" );
		screen.displayMessageLine( "\t\t2 - Withdraw" );
		screen.displayMessageLine( "\t\t3 - Deposit" );
		screen.displayMessageLine( "\t\t4 - Exit" );
		screen.displayMessageLine( "\t\t5 - Bye\n" );
		screen.displayMessage( "\tChoice: " );
		return keypad.getInput();
	}
}
