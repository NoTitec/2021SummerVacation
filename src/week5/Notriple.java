package week5;

public class Notriple implements Runselectnumber {


	public Notriple() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 1, 2, 2, 1 };
		int[] a2 = { 1, 1, 2, 2, 2, 1 };
		int[] a3 = { 1, 1, 1, 2, 2, 2, 1 };
		System.out.println(noTriples(a1));
		System.out.println(noTriples(a2));
		System.out.println(noTriples(a3));
	}

	private boolean noTriples(int[] a1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a1.length-2; i++) {
			if(a1[i]==a1[i+1]&&a1[i]==a1[i+2]) {
				return false;
			}
		}
		return true;
	}

	
}
