package week5;

public class Checkmininmax implements Runselectnumber {
private Input inp;
	public Checkmininmax(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int[] a1 = { 8, 3, 5, 7, 2, 4 };
		int[] a2 = { 14, 1, 22, 17, 36, 7, -43, 5 };
		System.out.println(countIn(a1, 9, 1));
		System.out.println(countIn(a2, 4, 17));
	}

	private int countIn(int[] a2, int i, int j) {
		// TODO Auto-generated method stub
		int cnt=0;
		
		if(i>=j) {
			return -1;
		}
		for (int k : a2) {
			if(k>=i&&k<=j) {
				cnt++;
			}
		}
		return cnt;
	}
	
}
