package week5;

public class Arrayspecifynumcount implements Runselectnumber {
private Input inp;
	public Arrayspecifynumcount(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 2, -9 };
		int[] a2 = { 1, 9, 9 };
		int[] a3 = { 1, 9, 9, 3, 9 };
		System.out.println(arrayCount9(a1));
		System.out.println(arrayCount9(a2));
		System.out.println(arrayCount9(a3));
	}

	private int arrayCount9(int[] a) {
		// TODO Auto-generated method stub
		int cnt=0;
		for (int i : a) {
			if(i==9) {
				cnt++;
			}
		}
		return cnt;
	}

}
