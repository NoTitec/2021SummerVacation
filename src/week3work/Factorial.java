package week3work;

public class Factorial implements Runselectnumber {
	int a;
	Input in;

	Factorial(Input a) {
		in = a;
	}
	public void reFactorial(){
		in=new Input();
	}
	public void run() {
		while (true) {
			System.out.println("input number");
			try {
				a = in.getIntinput();
				if(a>0)
				break;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				reFactorial();
			}
		}
		
		int result=1;
		for(int i=a;i>=1;i--) {
			result*=i;
		}
		System.out.print(a+"! =");
		for(int i=a;i>=1;i--) {
			System.out.print(i+" * ");
		}
		System.out.println("= "+result);
		
	}
}
