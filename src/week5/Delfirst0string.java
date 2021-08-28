package week5;

public class Delfirst0string implements Runselectnumber {
private Input inp;
	public Delfirst0string(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str = "00100234000";
		System.out.println("String    = " + str);
		str = removeFrontZ(str);
		System.out.println("Converted = " + str);
	}

	private String removeFrontZ(String str) {
		// TODO Auto-generated method stub
		int sindex=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='0') {
				sindex++;
				continue;
			}
			break;
		}
		return str.substring(sindex);
	}

}
