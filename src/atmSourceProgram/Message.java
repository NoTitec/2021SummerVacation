package atmSourceProgram;

public class Message {
	public static final String WELCOME = "\nWelcome!\n";
	public static final String GOODBYE = "\tBye...";
	public static final String BALANCE = "\tBalance: ";

	public static final String ERR_AUTH = "\n\tError: wrong account number or PIN number.";
	public static final String ERR_CHOICE = "\tWrong choice. Enter number between 1 and 5";
	public static final String ERR_DEBIT = "\tInsufficient balance";

	public static final String INPUT_NUMBER = "\tEnter your account number: ";
	public static final String INPUT_PIN = "\tEnter your PIN number: ";
	public static final String INPUT_AMOUNT = "\tEnter amount (0 to cancel): ";

	public static final String CANCEL_CREDIT = "\tCancel the deposit";
	public static final String CANCEL_DEBIT = "\tCancel the withdraw";

	public static final String FINISH_CREDIT = "\tComplete the deposit";
	public static final String FINISH_DEBIT = "\tComplete the withdraw";
}
