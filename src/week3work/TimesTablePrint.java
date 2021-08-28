package week3work;

public class TimesTablePrint implements Runselectnumber {
	Input in;
	public TimesTablePrint(Input a) {
		in=a;// TODO Auto-generated constructor stub
	}
public void run() {
	for(int i=1;i<=9;i++) {
		for(int j=2;j<=9;j++) {
			System.out.print(j+"*"+i+"=");
			System.out.printf("%2s",Integer.toString(i*j));
			System.out.print(" ");
		}
		System.out.println();
	}
}
}
