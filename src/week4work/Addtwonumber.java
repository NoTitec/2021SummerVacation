package week4work;

public class Addtwonumber implements Runselectnumber {
	int a, b;
	Input inp;

	Addtwonumber(Input in) {
		inp = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("�� ���� �Է�");
			try {
				a = inp.getIntinput();
				b = inp.getIntinput();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("you input not number");
				inp = new Input();
			}
		}
		System.out.println("�� ������ ��:"+ (a+b));
	}

}
