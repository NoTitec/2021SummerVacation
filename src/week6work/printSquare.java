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
		for(int i=0; i<n-m+1; i++) {//n-,+1���ٸ����
			int x = m+i;//ù��° ���� ����i�� ù��°�������Ѽ�
			for(int j=m; j<n+1; j++) {
			System.out.print(x);
			x++;
			if(x > n ) x = m;//����Ҽ��� n���� ũ�� x�� ���� j������ ����
			}
			System.out.println();
			}
	}
}
