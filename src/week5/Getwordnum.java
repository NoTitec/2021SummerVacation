package week5;

import java.util.StringTokenizer;

public class Getwordnum implements Runselectnumber {
Input inp;
	public Getwordnum(Input in) {
		inp=in;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("Input the string: ");
		String str = inp.getStringnextinput();
		StringTokenizer st1=new StringTokenizer(str);
		System.out.println(st1.countTokens());
	}

}
