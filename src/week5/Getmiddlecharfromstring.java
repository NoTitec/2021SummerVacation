package week5;

public class Getmiddlecharfromstring implements Runselectnumber {
private Input inp;
	public Getmiddlecharfromstring(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("Input a string: ");
		String str = inp.getStringnextinput();
		System.out.print("The middle character in the string: " + middle(str) + "\n");
	}

	private String middle(String str) {
		// TODO Auto-generated method stub
		return str.substring(str.length()/2, str.length()/2+1);
	}
	
}
