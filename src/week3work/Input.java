package week3work;

import java.util.Scanner;

public class Input {
	private Scanner input;
    
	public Input() { input = new Scanner( System.in ); } 
	public int getIntinput() { return input.nextInt(); }
	public String getStringinput() { return input.next();}
	
}
