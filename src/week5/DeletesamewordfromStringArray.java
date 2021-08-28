package week5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DeletesamewordfromStringArray implements Runselectnumber{
Input inp;
	public DeletesamewordfromStringArray(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] sa = new String[] { "is", "S8", "S8", "Oreo", "update", "Oreo", "is", "S8" };
		System.out.println("Original = " + Arrays.toString(sa));
		removeDuplicate(sa);
	}

	private void removeDuplicate(String[] sa) {
		// TODO Auto-generated method stub
		Set<String> dset=new HashSet<String>(Arrays.asList(sa));
		System.out.println("Result = "+dset);
	}

}
