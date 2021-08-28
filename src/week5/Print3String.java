package week5;

public class Print3String implements Runselectnumber {
private Input inp;
	public Print3String(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(sTimes("Hi", 3));
		System.out.println(sTimes("Hello", 2));
		System.out.println(sTimes("My Java", 2));
	}

	private String sTimes(String string, int in) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("");
		for(int i=0;i<in;i++) {
			a.append(string);
		}
		return a.toString();
	}

	
}
