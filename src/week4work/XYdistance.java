package week4work;

public class XYdistance implements Runselectnumber {
int x1,y1;
int x2,y2;
Input inp;
	public XYdistance(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				System.out.println("첫 xy 좌표입력");
				x1 = inp.getIntinput();
				y1 = inp.getIntinput();
				System.out.println("두번째 xy 좌표입력");
				x2 = inp.getIntinput();
				y2 = inp.getIntinput();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("input not number");
				inp = new Input();
			}
		}
		System.out.print("두좌표 거리: ");
		System.out.println(Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)));
	}

}
