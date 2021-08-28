package week4work;

import java.util.Random;

public class UpandDown implements Runselectnumber {
	Input inp, tin;
	int rannum;
	int inputnum;

	public UpandDown(Input in) {
		// TODO Auto-generated constructor stub
		inp = in;
		tin = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r = new Random();
		System.out.println("input number");
		rannum = r.nextInt(99);
		while (true) {
			while (true) {
				try {
					inputnum = inp.getIntinput();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("input intnumber");
					inp = tin;
				}
			}
			if(inputnum>rannum) {
				System.out.println("bigger input");
				continue;
			}
			else if(inputnum<rannum) {
				System.out.println("small input");
				continue;
			}
			else {
				System.out.println("correct number");
				break;
			}
		}
	}

}
