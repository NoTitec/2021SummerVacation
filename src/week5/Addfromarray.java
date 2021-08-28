package week5;

import java.util.Arrays;

public class Addfromarray implements Runselectnumber {
Input inp;
	public Addfromarray(Input in) {
		// TODO Auto-generated constructor stub
		inp=in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int[] my_array = { 11, 22, 33, 44, 55 };
		int Index_position = 2;
		int newValue = 99;
		System.out.println("Original Array : " + Arrays.toString(my_array));

		insertArray(my_array, Index_position);
		my_array[Index_position] = newValue;
		System.out.println("      New Array: " + Arrays.toString(my_array));
	}

	private void insertArray(int[] my_array, int index_position) {
		// TODO Auto-generated method stub
		for (int i = my_array.length-1; i >index_position; i--) {
			my_array[i]=my_array[i-1];
		}
	}

}
