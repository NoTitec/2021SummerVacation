package week6work;

public class countXX extends MakeInputobject implements Runselectnumber {

	public countXX() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		solve("abcxx");
		solve("xxx");
		solve("xxxx");
	}
	private void solve(String str) {
		int count=0;
		for (int i = 0; i < str.length()-1; i++) {
			String ch=str.substring(i, i+2);
			if(ch.equals("xx")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
