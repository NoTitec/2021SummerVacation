package week4work;

public class Factorial implements Runselectnumber {
	int a=1;
	int b;
	
	Input inp;
	public Factorial(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				System.out.println("input number");
				b=inp.getIntinput();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("you input not number");
				inp=new Input();
			}
		
		}
		for (int i = 1; i <= b; i++) {
			a*=i;
		}
		System.out.println(a);
	}
	
}
