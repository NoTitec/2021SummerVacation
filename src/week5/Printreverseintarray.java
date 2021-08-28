package week5;

public class Printreverseintarray implements Runselectnumber {
	private Input inp;

	public Printreverseintarray(Input in) {
		// TODO Auto-generated constructor stub
		inp = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int counter, i;
		int number[] = new int[100];
		System.out.print("How many integer elements(max 100)?");
		counter = inp.getIntinput();

		for (i = 0; i < counter; i++) {
			System.out.print("Enter Array Element" + (i + 1) + ": ");
			number[i] = inp.getIntinput();
		}

		number = reverse(number, counter);

		System.out.print("Reversed array: ");
		for (i = 0; i < counter; i++) {
			System.out.print(number[i] + "  ");
		}
	}

	public int[] reverse(int a[], int b) {
		int temp;
		for (int i = 0; i < b / 2; i++) {
			temp = a[i];

			a[i] = a[b - i - 1];

			a[b - i - 1] = temp;

		}
		return a;
	}
}
