package week8;

import java.util.Scanner;

class Input {
	protected Scanner input=null;
    
	public Input() { input = new Scanner( System.in ); } 
	public int getIntinput() { return input.nextInt(); }
	public double getdoubleinput() {return input.nextDouble();}
	public String getStringinput() { return input.next();}
	public String getStringnextinput() {return input.nextLine();}
}
