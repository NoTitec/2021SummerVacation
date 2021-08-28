package week4work;

public class Checkisprime implements Runselectnumber {
	private Input inp;
	private int a;
	private boolean c = true;

	public Checkisprime(Input in) {
		// TODO Auto-generated constructor stub
		inp = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			while (true) {
				try {
					a = inp.getIntinput();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("input not number");
					inp = new Input();
				}
			}
			if (a == -1) {
				break;
			} else {
				for (int i = 1; i < a; i++) {
					if (a % i == 0) {
						System.out.println("not prime number");
						c = false;
						break;
					}
				}
				if(c==true)
				System.out.println("primenumber");

			}
		}
	}

}
