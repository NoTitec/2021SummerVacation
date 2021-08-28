package week5;

public class Delend0string implements Runselectnumber {
private Input inp;
	public Delend0string(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str = "0012340000";
		System.out.println("String    = " + str);
		str = removeTrailZ(str);
		System.out.println("Converted = " + str);
	}

	private String removeTrailZ(String str) {
		// TODO Auto-generated method stub
		int endindex=str.length();
		for (int i = str.length()-1; i >=0 ; i--) {
			if(str.charAt(i)=='0') {
				endindex--;
				continue;
			}
			break;
		}
		
		return str.substring(0, endindex);
	}

}
