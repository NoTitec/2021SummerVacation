package week5;


public class Printarraychar implements Runselectnumber {
private Input inp;
char[] a= {'a','e','i','o','u'};
	public Printarraychar(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (char c : a) {
			System.out.print(c+" ");
			
		}
		System.out.println();
	}

}
