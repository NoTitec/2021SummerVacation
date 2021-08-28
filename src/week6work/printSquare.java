package week6work;

public class printSquare extends MakeInputobject implements Runselectnumber {
private int a,b;

	public printSquare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		a=inp.getIntinput();
		b=inp.getIntinput();
		printsq(a,b);
	}

	private void printsq(int m, int n) {
		for(int i=0; i<n-m+1; i++) {//n-,+1번줄만들기
			int x = m+i;//첫번째 수는 현재i와 첫번째인자합한수
			for(int j=m; j<n+1; j++) {
			System.out.print(x);
			x++;
			if(x > n ) x = m;//출력할수가 n보다 크면 x를 현재 j값으면 변경
			}
			System.out.println();
			}
	}
}
