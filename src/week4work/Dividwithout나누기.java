package week4work;

public class Dividwithout������ implements Runselectnumber {
	int a, b;
	Input inp;

	public Dividwithout������(Input in) {
		// TODO Auto-generated constructor stub
		inp = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				System.out.println("������ �Է�");
				a = inp.getIntinput();
				b = inp.getIntinput();
				if (b != 0 && a != 0) {
					break;
				} else {
					System.out.println("num2 must not 0");
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("input not number");
				inp = new Input();
			}
		}
		int result=0;
		while(true) {
			if(a<b)
				break;
			
			a=a-b;
			result++;
		}
		System.out.println(result);
	}

}
