package week6work;

public class MakeDigitRangeobject implements Runselectnumber {
	private DigitRange g=new DigitRange();
	private int a;
	public MakeDigitRangeobject(int a) {
		// TODO Auto-generated constructor stub
		this.a=a;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(g.run(a));
	}

}
