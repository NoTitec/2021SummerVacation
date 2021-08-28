package week4work;

public class GetabswithoutMath implements Runselectnumber {
Input inp,tnp;
int a;
	public GetabswithoutMath(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
		tnp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				a=inp.getIntinput();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("input not number try again");
				inp=new Input();
			}
		}
		System.out.println(-1*a);
	}

}
