package week5;

public class Checkebnum implements Runselectnumber {
private Input inp;
	public Checkebnum(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 1, 2, 3, 4 };
		int[] a2 = { 1, 1, 2, 4, 1 };
		int[] a3 = { 1, 1, 2, 2, 2, 3 };
		System.out.println(array123(a1));
		System.out.println(array123(a2));
		System.out.println(array123(a3));
	}

	private boolean array123(int[] a) {
		// TODO Auto-generated method stub
		boolean temp=true;
		for (int i = 1; i < a.length; i++) {
			if(a[i]<a[i-1]) {
				temp=false;
				break;
			}
		}
		return temp;
	}

}
