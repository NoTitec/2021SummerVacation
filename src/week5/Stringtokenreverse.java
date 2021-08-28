package week5;

import java.util.StringTokenizer;

public class Stringtokenreverse implements Runselectnumber {
private Input inp;
	public Stringtokenreverse(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str = "Hello Java World!";
		System.out.println("String          = " + str);
		System.out.println("Reversed String = " + reverse(str));
	}

	private String reverse(String str) {
		// TODO Auto-generated method stub
		StringTokenizer st1=new StringTokenizer(str);
		String r;
		StringBuffer result=new StringBuffer("");
		while(st1.hasMoreTokens()) {
			String curtoken=st1.nextToken();
			StringBuffer btoken=new StringBuffer(curtoken);
			result.append(btoken.reverse()+" ");
			
		}
		r=result.toString();
		return r;
	}

}
