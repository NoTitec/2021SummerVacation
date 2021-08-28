package week6work;

public class showtwos extends MakeInputobject implements Runselectnumber {

	public showtwos() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a=inp.getIntinput();
		soleve(a);
	}
	public void soleve(int num) {
		int c=0; int tnum=num;
		while(true) {
			if(tnum%2!=0) {
				break;
			}
			tnum=tnum/2;
			c++;
		}
		System.out.print(num+"=");
		for (int i = 0; i < c; i++) {
			System.out.print("2*");
		}
		System.out.println(tnum);
	}
}
