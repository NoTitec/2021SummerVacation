package atmSourceProgram;

public interface ITransaction {
	final static int CANCELED = 0;
	abstract public int 		getAccountNumber();
	abstract public BankDatabase 	getBankDatabase();
	abstract public void 		execute();

	default public int promptForAmount(Screen screen, Keypad keypad) {
		screen.displayMessage(Message.INPUT_AMOUNT);

		int input = keypad.getInput();
		return ( input == CANCELED ) ? CANCELED : input;
	}
}
