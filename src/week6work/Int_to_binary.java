package week6work;

public class Int_to_binary extends MakeInputobject implements Runselectnumber {

	public Int_to_binary() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int a=inp.getIntinput();
		String c=Integer.toBinaryString(a);
		System.out.println(c);
	}

}
