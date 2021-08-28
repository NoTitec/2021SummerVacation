package week4work;

public class Fibonach implements Runselectnumber {

	private Input inp;
	int input;
	int result = 0;
	boolean c = true;
	int cnt = 0;

	public Fibonach(Input in) {
		// TODO Auto-generated constructor stub
		inp = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				input = inp.getIntinput();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("input not number");
				inp = new Input();
			}
		}
		if(input==0||input==1) {
			System.out.println(input);
		}
		else
		{
			int temp,current=1,last=0;
			for(int i=2;i<=input;i++) {
				temp=current;
				current=current+last;
				last=temp;
				
			}
			System.out.println(current);
		}
	}
}
