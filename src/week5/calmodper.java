package week5;

public class calmodper implements Runselectnumber {
private Input inp;
int[] a1 = {2, 15, 150, 11, 27};
int[] a2 = {8, 11, 34, 20};
	public calmodper(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(percent(a1) + "%");
	    System.out.println(percent(a2) + "%");
	}
	private double percent(int a[]) {
		int cnt=0;
		for (int i : a) {
			if(i%2==0) {
				cnt++;
			}
		}
		
		return (double)cnt/(double)a.length*100;
	}
}
