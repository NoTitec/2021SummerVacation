package week3work;

public class ThreeFiveMultipleCalculator implements Runselectnumber {
	int n1, n2;
	Input in = new Input();

	public void run() {
		while (true) {
			while (true) {
				try {
					System.out.println("Input number 1");
					n1 = in.getIntinput();
					break;
				} catch (Exception e) {
					System.out.println("input not number");
					e.printStackTrace();// TODO: handle exception
					in = new Input();
				}
			}
			while (true) {
				try {
					System.out.println("Input number 2");
					n2 = in.getIntinput();
					break;
				} catch (Exception e) {
					System.out.println("input not number");
					e.printStackTrace();// TODO: handle exception
					in = new Input();
				}
			}
			if(n1<n2) {
				break;
			}
		}
		for(int i=n1;i<=n2;i++) {
			if(i%3==0) {
				System.out.println(i);
				continue;
			}
			else if(i%5==0) {
				System.out.println(i);
			}
		}
	}

}
