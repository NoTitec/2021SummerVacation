package week6work;

public class MakeGetfreqnum implements Runselectnumber {
private int[] t;
private Getmostfrequentlynumber g=new Getmostfrequentlynumber();
	MakeGetfreqnum(int[]a){
		
		t=a.clone();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(g.run(t));
	}

}
