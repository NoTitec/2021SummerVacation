package week4work;

public class Addallprimenumber implements Runselectnumber {
private Input inp;
int input;
int result=0;
boolean c=true;
int cnt=0;
	public Addallprimenumber(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				input=inp.getIntinput();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("input not number");
				inp=new Input();
			}
		}
		for (int i = 1; i <= input; i++) {
			c=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c=false;
					break;
				}
				
			}
			if(c==true)
			{
				cnt++;
				result=result+i;
				
			}
			
		}
		System.out.println(cnt+" "+result);
	}

}
