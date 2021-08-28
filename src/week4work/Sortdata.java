package week4work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sortdata implements Runselectnumber {
private Input inp;
//private int[] data=new int[10];
ArrayList<Integer> integerlist=new ArrayList<Integer>();
	public Sortdata(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			integerlist.add(inp.getIntinput());
		}
		print(integerlist);
		Collections.sort(integerlist);
		
		print(integerlist);
		Collections.sort(integerlist, new reverseInteger());;
		print(integerlist);
	}

	public void print(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	
}
class reverseInteger implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
