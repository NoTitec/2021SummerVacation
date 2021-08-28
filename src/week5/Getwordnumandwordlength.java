package week5;

import java.util.StringTokenizer;

public class Getwordnumandwordlength implements Runselectnumber {
private Input inp;
	public Getwordnumandwordlength(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str = "Hello this is Java World";
		System.out.println("String is : " + str);
		count(str);
	}

	private void count(String str) {
		// TODO Auto-generated method stub
		StringTokenizer st1=new StringTokenizer(str);
		int cnt=0;
		while(st1.hasMoreTokens()) {
			cnt++;
			String curtoken=st1.nextToken();
			System.out.println(cnt+":"+curtoken+":"+curtoken.length());
		}
	}

}
