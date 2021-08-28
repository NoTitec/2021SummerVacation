package week5;

public class Printarraysum implements Runselectnumber {
private Input inp;
private int my_array[];
	public Printarraysum(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
		my_array= new int[] {1,2,3,4,5,6,7,8,9,10};
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int result=0;
		for (int i : my_array) {
			result+=i;
		}
		System.out.println("sum is "+result);
		
	}

}
