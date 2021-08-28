package week5;

import java.util.Arrays;

public class Deletefromarray implements Runselectnumber {
	private Input inp;

	public Deletefromarray(Input in) {
		// TODO Auto-generated constructor stub
		inp = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int[] my_array = { 25, 14, 56, 15, 36, 56 };
		System.out.println("Original Array : " + Arrays.toString(my_array));
		removeArr(my_array, 1);
		System.out.println("After removing the second element: " + Arrays.toString(my_array));

		int[] new_array = new int[my_array.length - 1];
		for (int i = 0; i < new_array.length; i++) {
			new_array[i] = my_array[i];
		}
		System.out.println("After removing the second element: " + Arrays.toString(new_array));
	}

	private void removeArr(int[]a,int b) {
		for(int i=b;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
	}
}
